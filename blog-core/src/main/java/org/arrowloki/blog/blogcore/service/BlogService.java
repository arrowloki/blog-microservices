package org.arrowloki.blog.blogcore.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.arrowloki.blog.blogcore.models.Blog;
import org.arrowloki.blog.blogcore.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    private final BlogRepository blogRepository;
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

}
