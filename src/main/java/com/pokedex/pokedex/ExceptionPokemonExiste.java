package com.pokedex.pokedex;

public class ExceptionPokemonExiste extends Exception{
    @Override
    public String getMessage() {
        return "Esse pokemon já existe";
    }
}
