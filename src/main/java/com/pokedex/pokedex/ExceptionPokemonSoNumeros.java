package com.pokedex.pokedex;

public class ExceptionPokemonSoNumeros extends Exception{
    @Override
    public String getMessage() {
        return "O nome deve conter letras";
    }
}
