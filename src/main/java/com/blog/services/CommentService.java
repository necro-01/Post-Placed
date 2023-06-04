package com.blog.services;

import com.blog.payloads.CommentDto;

import java.util.Set;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);

    Set<CommentDto> getAllCommentsOnPost(Integer postId);
}
