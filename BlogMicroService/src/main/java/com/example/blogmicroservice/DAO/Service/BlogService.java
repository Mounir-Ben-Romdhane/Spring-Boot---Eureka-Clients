package com.example.blogmicroservice.DAO.Service;

import com.example.blogmicroservice.DAO.Entities.Blog;
import com.example.blogmicroservice.DAO.Repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements  IBlogService{

@Autowired
BlogRepository blogRepository;

    @Override
    public Blog addBlog(Blog b) {
        return blogRepository.save(b);
    }
}

