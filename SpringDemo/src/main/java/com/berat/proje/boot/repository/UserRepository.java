package com.berat.proje.boot.repository;

import com.berat.proje.boot.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
