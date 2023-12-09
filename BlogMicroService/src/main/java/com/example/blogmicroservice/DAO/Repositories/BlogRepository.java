package com.example.blogmicroservice.DAO.Repositories;

import com.example.blogmicroservice.DAO.Entities.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface BlogRepository extends MongoRepository <Blog,Long> {
}
