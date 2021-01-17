package br.com.zallpy.technicalevaluation.dto;

import br.com.zallpy.technicalevaluation.security.AuthenticatedUser;

public class AuthenticatedUserDTO {

    private AuthenticatedUser authenticatedUser;

    public AuthenticatedUserDTO(AuthenticatedUser authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    public int getUserId() {
        return authenticatedUser.getId();
    }

    public String getEmail() {
        return authenticatedUser.getUsername();
    }

    public String getToken() {
        return authenticatedUser.getToken();
    }

}
