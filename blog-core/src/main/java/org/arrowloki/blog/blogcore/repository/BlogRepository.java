package org.arrowloki.blog.blogcore.repository;

import org.arrowloki.blog.blogcore.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
