package com.blog.payloads;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty(message = "This field must not be empty")
    @Size(min = 2, message = "Username should contain at least 2 characters")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @NotEmpty(message = "This field must not be empty")
    @Size(min = 3, message = "Password should contain at least 3 characters")
    @Size(max = 20, message = "Password too long!")
    private String password;

    private String about;

    private Set<RoleDto> roles = new HashSet<>();

    // JsonIgnore --> don't send the password to the client
    // but JsonIgnore will also ignore setter
    @JsonIgnore
    public String getPassword() {
        return this.password;
    }

    // so, we have to manually tell it not to ignore the setter
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }
}
