package com.HiagoDev.Aula.Repositories;

import com.HiagoDev.Aula.entities.OrderItem;
import com.HiagoDev.Aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
