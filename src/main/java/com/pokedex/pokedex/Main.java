package com.pokedex.pokedex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Main extends Application {
    private static Stage stage;

    private static Scene scLoad;
    private static Scene scHome;
    private static Scene scCadastro;
    private static Scene scLogin;
    private static Scene scAdPoke;

    @Override
    public void start(Stage stageS) throws IOException {

        ScHomeController home = new ScHomeController();
        home.configurarUsuarios();
        System.out.println("Usuários registrados:");
        for (User u : home.users) {
            System.out.println(u);
        }
        home.configurarPokemons();
        System.out.println("Pokemons registrados:");
        for (Pokemon p : home.pokemons) {
            System.out.println(p);
        }

        stage = stageS;

        stageS.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/pokedex/pokedex/img/Icone.png"))));
        stageS.resizableProperty().setValue(Boolean.FALSE);

        FXMLLoader fxmlLoad = new FXMLLoader(Main.class.getResource("scLoad.fxml"));
        scLoad = new Scene(fxmlLoad.load(), 16 * 64, 9 * 64);

        FXMLLoader fxmlHome = new FXMLLoader(Main.class.getResource("scHome.fxml"));
        scHome = new Scene(fxmlHome.load(), 16 * 64, 9 * 64);

        FXMLLoader fxmlCadastro = new FXMLLoader(Main.class.getResource("scAddUser.fxml"));
        scCadastro = new Scene(fxmlCadastro.load(), 16 * 64, 9 * 64);

        FXMLLoader fxmlLogin = new FXMLLoader(Main.class.getResource("scLogin.fxml"));
        scLogin = new Scene(fxmlLogin.load(), 16 * 64, 9 * 64);

        FXMLLoader fxmlAdPoke = new FXMLLoader(Main.class.getResource("scAddPoke.fxml"));
        scAdPoke = new Scene(fxmlAdPoke.load(), 16 * 64, 9 * 64);

        stageS.setTitle("Pokedex - Gotta Catch Them All");
        stageS.setScene(scLoad);
        stageS.show();
    }

    public static void changeScreen(String scene, Object userData) {
        switch (scene) {
            case "load" -> {
                stage.setScene(scLoad);
                notfifyListeners("load", userData);
            }
            case "home" -> {
                stage.setScene(scHome);
                notfifyListeners("home", userData);
            }
            case "cadastro" -> {
                stage.setScene(scCadastro);
                notfifyListeners("cadastro", userData);
            }
            case "login" -> {
                stage.setScene(scLogin);
                notfifyListeners("login", userData);
            }
            case "adPoke" -> {
                stage.setScene(scAdPoke);
                notfifyListeners("adPoke", userData);
            }

        }
    }

    public static void changeScreen(String scene) {
        changeScreen(scene, null);
    }

    public static void main(String[] args) {
        launch();
    }
    
    private static final ArrayList<OnChangeScreen> listeners = new ArrayList<>();

    public interface OnChangeScreen {
        void onScreenChanged(String newScreen, Object userData);
    }

    public static void addOnChegeScreenListener(OnChangeScreen newListener) {
        listeners.add(newListener);
    }

    private static void notfifyListeners(String newScreen, Object userData) {
        for (OnChangeScreen l : listeners) {
            l.onScreenChanged(newScreen, userData);
        }
    }
}
