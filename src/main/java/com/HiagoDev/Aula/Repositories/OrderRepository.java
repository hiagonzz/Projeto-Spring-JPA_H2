package com.HiagoDev.Aula.Repositories;

import com.HiagoDev.Aula.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
