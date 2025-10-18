package com.generation.arcanagames.repository;

import com.generation.arcanagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal; // Importação necessária para usar o tipo do preço
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

    
    public List<Produto> findByPrecoGreaterThanOrderByPrecoAsc(BigDecimal preco);

    
    public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}