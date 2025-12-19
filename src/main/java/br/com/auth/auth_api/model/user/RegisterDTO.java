package br.com.auth.auth_api.model.user;

public record RegisterDTO(String login, String password, UserRole role) {
}