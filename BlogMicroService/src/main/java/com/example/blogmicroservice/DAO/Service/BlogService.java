package com.example.blogmicroservice.DAO.Service;

import com.example.blogmicroservice.DAO.Entities.Blog;
import com.example.blogmicroservice.DAO.Repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements  IBlogService{

@Autowired
BlogRepository blogRepository;

    @Override
    public Blog addBlog(Blog b) {
        return blogRepository.save(b);
    }

    @Override
    public Blog editBlog(Long id , Blog b) {
        return blogRepository.save(b);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findAllById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
       blogRepository.deleteById(id);
    }

    @Override
    public void delete(Blog b) {
        blogRepository.delete(b);
    }
}

