package com.HiagoDev.Aula.Repositories;

import com.HiagoDev.Aula.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
