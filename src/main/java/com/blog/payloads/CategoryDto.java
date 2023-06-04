package com.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;

    @NotEmpty(message = "This field must not be empty")
    @Size(min = 2, message = "This field requires at least two characters")
    private String categoryTitle;

    @NotEmpty(message = "This field must not be empty")
    private String categoryDescription;
}
