package com.blog.repositories;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findAllByUser(User user);

    Page<Post> findPostsByUserId(Integer userId, Pageable pageable);

    List<Post> findAllByCategory(Category category);

    Page<Post> findPostsByCategory_CategoryId(Integer categoryId, Pageable pageable);

    List<Post> findByTitleContaining(String title);
}
