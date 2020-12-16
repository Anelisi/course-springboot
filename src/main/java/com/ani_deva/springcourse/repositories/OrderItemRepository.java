package com.ani_deva.springcourse.repositories;

import com.ani_deva.springcourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
