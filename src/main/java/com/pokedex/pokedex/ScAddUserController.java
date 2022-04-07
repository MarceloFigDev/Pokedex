package com.pokedex.pokedex;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Objects;
import java.util.Random;

public class ScAddUserController extends Pokedex {
    @FXML
    protected void initialize() {
        Main.addOnChegeScreenListener((newScreen, userData) -> {
            //Acontecer quando trocar de tela
        });
    }

    Alert alertInform = new Alert(Alert.AlertType.INFORMATION);
    public void alertInformCadastro(String user) {
        alertInform.setTitle("Cadastrado");
        alertInform.setHeaderText("");
        alertInform.setContentText("Usuário " + user + " cadastrado com sucesso");
        alertInform.show();
    }

    @FXML private TextField tfNome;
    @FXML private TextField tfSobrenome;
    @FXML private PasswordField pfSenha;
    @FXML private PasswordField pfSenhaC;
    @FXML private TextField tfUser;
    @FXML private Label lbSenhaC;
    @FXML private Label lbUserC;
    @FXML private Label lbNomeC;
    @FXML private Label lbUserSenhaC;

    Random rnd = new Random();

    public void verificarSeUserCadastravel(){
        boolean nomeC;
        boolean sobrenomeC;
        boolean senhaC;
        boolean userC;

        if (Objects.equals(tfNome.getText(), "")) {
            System.out.println("Nome em branco");
            lbNomeC.setVisible(true);
            nomeC = false;
        } else {
            nomeC = true;
        }

        if (Objects.equals(tfSobrenome.getText(), "")) {
            System.out.println("Sobrenome em branco");
            lbNomeC.setVisible(true);
            sobrenomeC = false;
        } else {
            sobrenomeC = true;
        }

        if (Objects.equals(pfSenha.getText(), "") && Objects.equals(pfSenhaC.getText(), "")) {
            System.out.println("Senha em branco");
            lbUserSenhaC.setVisible(true);
            senhaC = false;
        } else {
            if (Objects.equals(pfSenha.getText(), pfSenhaC.getText()) && !Objects.equals(pfSenha.getText(), "")) {
                System.out.println("Senhas iguais");
                senhaC = true;
            } else {
                System.out.println("As senhas não são iguais");
                pfSenha.clear();
                pfSenhaC.clear();
                lbSenhaC.setVisible(true);
                senhaC = false;
            }
        }

        if (Objects.equals(tfUser.getText(), "")) {
            System.out.println("Usuário em branco");
            lbUserSenhaC.setVisible(true);
            userC = false;
        } else {
            conferirExistenciaUser(tfUser.getText());
            if (!conferirExistenciaUser) {
                System.out.println("Usuário novo");
                userC = true;
            } else {
                System.out.println("Usuário já existe");
                tfUser.clear();
                lbUserC.setVisible(true);
                userC = false;
            }
        }
        if (nomeC && sobrenomeC && senhaC && userC){
            System.out.println("Cadastrado");
            cadastrar(tfNome.getText(),tfSobrenome.getText(),tfUser.getText(),pfSenha.getText());
        } else {
            System.out.println("Erro ao cadastrar novo usuário");
        }
    }

    public void cadastrar(String nome, String sobrenome, String user, String senha) {
        tfNome.clear();
        tfSobrenome.clear();
        pfSenha.clear();
        pfSenhaC.clear();
        tfUser.clear();

        int id = users.size();
        int foto = rnd.nextInt(0, 9);

        if (ManageUsers.addUser(id,nome, sobrenome, user, senha, foto)) {
            System.out.println("Usuário " + user + " cadastrado com sucesso");
            alertInformCadastro(user);
            Main.changeScreen("load");
            System.out.println("load");
        }
    }

    public void btnCadastrar() {
        verificarSeUserCadastravel();
    }

    public void btnInicio() {
        Main.changeScreen("load");
        System.out.println("Inicio");
    }

    public void btnPesquisa() {
        Main.changeScreen("home");
        System.out.println("Visita");
    }

    public void tfNome() {
        lbNomeC.setVisible(false);
    }

    public void tfSobrenome() {
        lbNomeC.setVisible(false);
    }

    public void pfSenha() {
        lbSenhaC.setVisible(false);
        lbUserSenhaC.setVisible(false);
    }

    public void tfUser() {
        lbUserC.setVisible(false);
        lbUserSenhaC.setVisible(false);
    }

    public void tfNomeNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            tfSobrenome.requestFocus();
        }
    }

    public void tfSobrenomeNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            pfSenha.requestFocus();
        }
    }

    public void pfSenhaNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            pfSenhaC.requestFocus();
        }
    }

    public void pfSenhaCNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            tfUser.requestFocus();
        }
    }

    public void tfUserNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            verificarSeUserCadastravel();
        }
    }
}
