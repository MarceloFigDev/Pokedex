package com.pokedex.pokedex;

import java.io.*;
import java.util.ArrayList;

public abstract class Pokedex extends ManageUsers {

    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public void configurarPokemons(){
        pokemons.clear();
        try {
            FileReader arq = new FileReader(CSVPOKEMONS);
            BufferedReader lerArq = new BufferedReader(arq);
            String l;
            try {
                l = lerArq.readLine();
                while (l != null){

                    String[] info = l.split(",");
                    Pokemon pk = new Pokemon();
                    pk.setNum(info[0]);
                    pk.setNome(info[1]);
                    pk.setTip1(info[2]);
                    pk.setTip2(info[3]);
                    pk.setTotal(info[4]);
                    pk.setHp(info[5]);
                    pk.setAtaque(info[6]);
                    pk.setDefesa(info[7]);
                    pk.setAtaqueE(info[8]);
                    pk.setDefesaE(info[9]);
                    pk.setVeloc(info[10]);
                    pk.setUser(info[11]);

                    pokemons.add(pk);

                    l = lerArq.readLine();
                }

                arq.close();
            } catch (IOException e){
                System.out.println("Erro: Não foi possível ler o arquivo");
            }
        } catch (FileNotFoundException e){
            System.out.println("Erro: Arquivo não encontrado");
        }
    }

        public static boolean addPokemon(int num,String nome,String tip1,String tip2,int total,int hp,int ataque,int defesa,int ataqueE,int defesaE,int veloc,int user){
        try {
            FileWriter arq = new FileWriter(CSVPOKEMONS,true);
            PrintWriter gravArq = new PrintWriter(arq);

            if (tip2 == null){
                gravArq.append(num + "," + nome + "," + tip1 + ",," + total + "," + hp + "," + ataque + "," + defesa + "," + ataqueE + "," + defesaE + "," + veloc + "," + user + "\n");
            } else {
                gravArq.append(num + "," + nome + "," + tip1 + "," + tip2 + "," + total + "," + hp + "," + ataque + "," + defesa + "," + ataqueE + "," + defesaE + "," + veloc + "," + user + "\n");
            }
            gravArq.close();
            return true;
        } catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    boolean conferirExisteciaPokemon;
    public void conferirExistenciaPokemon(String nome){
        configurarPokemons();
        for (Pokemon pk : pokemons){
            if (pk.getNome().equalsIgnoreCase(nome)){
                conferirExisteciaPokemon = true;
                break;
            } else {
                conferirExisteciaPokemon = false;
            }
        }
    }
}
