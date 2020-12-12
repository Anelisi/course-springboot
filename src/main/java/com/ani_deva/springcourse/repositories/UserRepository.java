package com.ani_deva.springcourse.repositories;

import com.ani_deva.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {

}
