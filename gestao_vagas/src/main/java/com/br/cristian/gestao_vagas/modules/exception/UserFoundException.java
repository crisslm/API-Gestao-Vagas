package com.br.cristian.gestao_vagas.modules.exception;

public class UserFoundException extends RuntimeException{
    public UserFoundException() {
        super("Usuario ja existe");
    }
}
