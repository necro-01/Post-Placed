package com.blog;

import com.blog.config.AppConstants;
import com.blog.entities.Role;
import com.blog.repositories.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {

    public static final String[] PUBLIC_URLS = {"/api/v1/auth/**", "/v2/api-docs", "/v3/api-docs", "/swagger-resources/**", "/swagger-ui/**", "/webjars/**"};
    private final RoleRepo roleRepo;

    public BlogAppApisApplication(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApisApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(this.passwordEncoder.encode("123"));
        try {
            Role role1 = new Role();
            role1.setId(AppConstants.ROLE_ADMIN);
            role1.setName("ROLE_ADMIN");

            Role role2 = new Role();
            role2.setId(AppConstants.ROLE_NORMAL);
            role2.setName("ROLE_NORMAL");

            List<Role> roles = List.of(role1, role2);
            List<Role> result = this.roleRepo.saveAll(roles);

            result.forEach(role -> {
                System.out.println(role.getName());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
