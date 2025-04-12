
package com.cherrycalf.filegohome;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class FileController {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .dispatcherTypeMatchers(HttpMethod.valueOf("/**")).permitAll() // 允许公开访问的路径
//                        .anyRequest().authenticated()          // 其他请求需要认证
                );
//                .formLogin(form -> form
//                        .loginPage("/login").permitAll()      // 自定义登录页面
//                )
//                .logout(logout -> logout
//                        .permitAll()
//                );
        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().dispatcherTypeMatchers(HttpMethod.valueOf("/public/**")); // 忽略公开路径
    }
}