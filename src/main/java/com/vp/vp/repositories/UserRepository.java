package com.vp.vp.repositories;

import com.vp.vp.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Override
    public List<User> findAll();
}
