package com.ani_deva.springcourse.repositories;

import com.ani_deva.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
