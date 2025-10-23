package org.arrowloki.blog.blogcore.controller;

import org.arrowloki.blog.blogcore.models.Blog;
import org.arrowloki.blog.blogcore.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private final BlogService blogService;
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/")
    public ResponseEntity<Blog> create(@RequestBody Blog blog) {
        Blog response = blogService.create(blog);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/")
    public ResponseEntity<List<Blog>> getAll() {
        return ResponseEntity.ok(blogService.getAll());
    }
}
