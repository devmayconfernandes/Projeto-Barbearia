package com.trabalho.barbershop.services.exceptions;

    public class DatabaseException extends RuntimeException{

    public DatabaseException() {
        super("Esse telefone já existe");
    }

    public DatabaseException(String msg) {
        super(msg);
    }
}