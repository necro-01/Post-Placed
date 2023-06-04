package com.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Getter
@Setter
public class CommentDto {

    private Integer commentId;

    @NotEmpty(message = "This field must not be empty")
    private String content;
}
