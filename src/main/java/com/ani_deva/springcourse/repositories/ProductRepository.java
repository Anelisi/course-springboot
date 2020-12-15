package com.ani_deva.springcourse.repositories;

import com.ani_deva.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
