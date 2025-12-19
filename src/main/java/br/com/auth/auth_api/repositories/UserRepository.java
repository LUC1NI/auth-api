package br.com.auth.auth_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.auth.auth_api.model.user.User;

public interface UserRepository extends JpaRepository<User, String> {
    
    UserDetails findByLogin(String login);
}