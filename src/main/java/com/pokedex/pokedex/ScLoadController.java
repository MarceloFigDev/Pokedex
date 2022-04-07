package com.pokedex.pokedex;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ScLoadController extends ManageUsers implements Sobre{

    @FXML
    protected void initialize(){
        Main.addOnChegeScreenListener((newScreen, userData) -> {
            //Acontecer quando trocar de tela
        });{
        }
        lbBoasVindas.setText(WBTXT);
    }

    @FXML private Label lbBoasVindas;
    @FXML private PasswordField pfSenha;
    @FXML private TextField tfUser;
    @FXML private Label lbErroLogin;

    public void logar(){
        System.out.println("Logando...");
        logar(tfUser.getText(), pfSenha.getText());

        if (conferirUserSenha){
            System.out.println("Logado");
            tfUser.clear();
            pfSenha.clear();
            Main.changeScreen("home", userLogado);
        } else {
            System.out.println("Erro ao logar");
            tfUser.clear();
            pfSenha.clear();
            lbErroLogin.setVisible(true);
        }
    }

    public void btnLogar() {
        logar();
    }

    public void btnCadastro() {
        Main.changeScreen("cadastro");
        System.out.println("Cadastrar-se");
    }

    public void btnVisitante() {
        Main.changeScreen("home");
        System.out.println("Visita");
    }

    public void pfSenha() {
        lbErroLogin.setVisible(false);
    }

    public void tfUser() {
        lbErroLogin.setVisible(false);
    }

    public void tfUserNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            pfSenha.requestFocus();
        }
    }

    public void pfSenhaNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            logar();
        }
    }
}
