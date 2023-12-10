package com.example.blogmicroservice.DAO.Service;

import com.example.blogmicroservice.DAO.Entities.Blog;

import java.util.List;

public interface IBlogService {
    Blog addBlog(Blog b);

    Blog editBlog(Long id, Blog b);
    List<Blog>  findAll();

    Blog findAllById(long id);

    void deleteById(long id);

    void delete(Blog b);
}
