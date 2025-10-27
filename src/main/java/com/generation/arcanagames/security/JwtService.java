package com.generation.arcanagames.security;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
	
	private static final String SECRET = "4ef883f3273a9cee1a299237baa8fc3ccabad17b7e18a3ab5082ff92eb0a3418";
	private static final Duration Expiration_Duration = Duration.ofMinutes(60);
	
	private final SecretKey signingKey;
	
	private JwtService() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		this.signingKey = Keys.hmacShaKeyFor(keyBytes);
	}
	
	private Claims extractAllClaims(String token) {
		return Jwts.parser()
				.verifyWith(signingKey)
				.build()
				.parseSignedClaims(token)
				.getPayload();
	}

	public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
	}
	
	public Date extractExpiration(String token) {
		return extractAllClaims(token).getExpiration();
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {
		Claims claims = extractAllClaims(token);
		return claims.getSubject().equals(userDetails.getUsername()) && 
			   claims.getExpiration().after(new Date());
	}
	
	public String generateToken(String username) {
		Instant now = Instant.now();
		return Jwts.builder()
				.subject(username)
				.issuedAt(Date.from(now))
				.expiration(Date.from(now.plus(Expiration_Duration)))
				.signWith(signingKey)
				.compact();	
	}
}
