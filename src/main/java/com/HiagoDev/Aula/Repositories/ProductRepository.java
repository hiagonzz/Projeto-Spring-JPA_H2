package com.HiagoDev.Aula.Repositories;

import com.HiagoDev.Aula.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
