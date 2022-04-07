package com.pokedex.pokedex;

public class ExceptionPesquisaNumero extends Exception{
    @Override
    public String getMessage() {
        return "O usuário pesquisou números";
    }
}
