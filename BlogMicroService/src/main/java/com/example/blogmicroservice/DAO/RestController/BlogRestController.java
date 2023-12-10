package com.example.blogmicroservice.DAO.RestController;

import com.example.blogmicroservice.DAO.Entities.Blog;
import com.example.blogmicroservice.DAO.Service.BlogService;
import com.example.blogmicroservice.DAO.Service.IBlogService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/deleteBlog/{id}")
    void delete(@PathVariable("id") long id){ //@requestBody besh yjibhom sinon yjiounii null
        iBlogService.deleteById(id);
    }

    @PutMapping("update/{id}")
    Blog updateBlog(@PathVariable("id") Long id, @RequestBody Blog b){
        return iBlogService.editBlog(id, b);
    }
    @GetMapping("/findAll")
    List<Blog> findAll(){
        return  iBlogService.findAll();
    }

    @GetMapping("/{id}")
    Blog findById(@PathVariable("id") Long id){
        return iBlogService.findAllById(id);
    }

}
