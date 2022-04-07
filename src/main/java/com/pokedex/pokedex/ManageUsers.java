package com.pokedex.pokedex;

import java.io.*;
import java.util.ArrayList;

public abstract class ManageUsers extends Fraquezas implements Paths {

    ArrayList<User> users = new ArrayList<>();

    public void configurarUsuarios() {
        try {
            FileReader arq = new FileReader(CSVUSERS);
            BufferedReader lerArq = new BufferedReader(arq);
            String l;
            try {
                l = lerArq.readLine();
                while (l != null){

                    String[] info = l.split(",");
                    User user = new User();
                    user.setId(info[0]);
                    user.setNome(info[1]);
                    user.setSobrenome(info[2]);
                    user.setUser(info[3]);
                    user.setSenha(info[4]);
                    user.setFoto(info[5]);

                    users.add(user);

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

    public static boolean addUser(int id, String nome, String sobrenome, String user, String senha, int foto){
        try{
            FileWriter arq = new FileWriter(CSVUSERS,true);
            PrintWriter gravArq = new PrintWriter(arq);

            gravArq.append(id + "," + nome + "," + sobrenome + "," + user + "," + senha + "," + foto + "\n");
            gravArq.close();
            return true;
        } catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    boolean conferirExistenciaUser;
    public void conferirExistenciaUser(String user){
        configurarUsuarios();
        for (User u : users){
            if (u.getUser().equalsIgnoreCase(user)){
                conferirExistenciaUser = true;
                break;
            } else {
                conferirExistenciaUser = false;
            }
        }
    }

    boolean conferirUserSenha;
    int userLogado;
    public void logar(String user, String senha){
        configurarUsuarios();
        for (User u : users){
            if (u.getUser().equalsIgnoreCase(user) && u.getSenha().equalsIgnoreCase(senha)){
                conferirUserSenha = true;
                userLogado = Integer.parseInt(u.getId());
                break;
            }
        }
    }
}
