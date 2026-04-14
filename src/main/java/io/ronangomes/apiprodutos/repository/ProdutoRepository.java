package io.ronangomes.apiprodutos.repository;

import io.ronangomes.apiprodutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
