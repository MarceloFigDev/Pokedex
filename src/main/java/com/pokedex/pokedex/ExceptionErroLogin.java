package com.pokedex.pokedex;

public class ExceptionErroLogin extends Exception{
    @Override
    public String getMessage() {
        return "Erro ao logar";
    }
}
