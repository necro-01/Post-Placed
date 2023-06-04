package com.blog.repositories;

import com.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
    Set<Comment> findCommentsByPost_PostId(Integer postId);
}
