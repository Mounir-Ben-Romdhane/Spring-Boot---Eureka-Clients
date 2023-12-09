package com.example.blogmicroservice.DAO.RestController;

import com.example.blogmicroservice.DAO.Entities.Blog;
import com.example.blogmicroservice.DAO.Service.BlogService;
import com.example.blogmicroservice.DAO.Service.IBlogService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("blog")
public class BlogRestController {

    @Autowired
    IBlogService iBlogService;
    @Autowired
    BlogService blogService;

    @PostMapping("/add")
    Blog addBlog(@RequestBody Blog b) {
        return iBlogService.addBlog(b);
    }



}
