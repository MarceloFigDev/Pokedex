package com.pokedex.pokedex;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Objects;

public class ScHomeController extends Pokedex implements Sobre {

    @FXML
    protected void initialize() {

        configurarPokemons();

        Main.addOnChegeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Object userData) {
                //Acontecer quando trocar de tela

                String urlUserImg;
                if (userData != null) {
                    logado = true;
                    configurarUsuarios();
                    configurarPokemons();
                    id = (int) userData;
                    System.out.println("Olá, " + users.get(id).getUser());
                    lbWelcome.setText("Olá, " + users.get(id).getUser() + ".");
                    urlUserImg = USERSIMG + users.get(id).getFoto() + ".png";
                    btnAddPokemon.setVisible(true);
                } else {
                    logado = false;
                    lbWelcome.setText("Olá, Treinador.");
                    urlUserImg = USERSIMG + "User.png";
                    btnAddPokemon.setVisible(false);
                }

                Image perfil = new Image(Objects.requireNonNull(getClass().getResourceAsStream(urlUserImg)));
                ivUser.setImage(perfil);
            }
        });

        lbPokedex.setText(POKETXT);
    }

    Alert alertInform = new Alert(Alert.AlertType.INFORMATION);

    public void alertInform(String titulo, String mensagem) {
        alertInform.setTitle(titulo);
        alertInform.setHeaderText("");
        alertInform.setContentText(mensagem);
        alertInform.show();
    }

    @FXML
    private TextField tfPesquisaPokemon;
    @FXML
    private Label lbWelcome;
    @FXML
    private Label lbNomeNum;
    @FXML
    private Label lbPokedex;
    @FXML
    private Label lbErro;
    @FXML
    private ImageView imgPokemonPesquisado;
    @FXML
    private ImageView ivUser;
    @FXML
    private Button btnAddPokemon;
    @FXML
    private Pane pStatus;
    @FXML
    private ProgressBar pbHp;
    @FXML
    private ProgressBar pbAta;
    @FXML
    private ProgressBar pbDef;
    @FXML
    private ProgressBar pbAtaEsp;
    @FXML
    private ProgressBar pbDefEsp;
    @FXML
    private ProgressBar pbSpeed;
    @FXML
    private Label lbHp;
    @FXML
    private Label lbAta;
    @FXML
    private Label lbDef;
    @FXML
    private Label lbAtaEsp;
    @FXML
    private Label lbDefEsp;
    @FXML
    private Label lbSpeed;
    @FXML
    private Pane pTip1;
    @FXML
    private Rectangle recTip1;
    @FXML
    private Label lbTip1;
    @FXML
    private Pane pTip2;
    @FXML
    private Rectangle recTip2;
    @FXML
    private Label lbTip2;
    @FXML
    private Pane pFra1;
    @FXML
    private Rectangle recFra1;
    @FXML
    private Label lbFra1;
    @FXML
    private Pane pFra2;
    @FXML
    private Rectangle recFra2;
    @FXML
    private Label lbFra2;
    @FXML
    private Pane pFra3;
    @FXML
    private Rectangle recFra3;
    @FXML
    private Label lbFra3;
    @FXML
    private Pane pFra4a;
    @FXML
    private Pane pFra4b;
    @FXML
    private Rectangle recFra4;
    @FXML
    private Label lbFra4;
    @FXML
    private Pane pFra5;
    @FXML
    private Rectangle recFra5;
    @FXML
    private Label lbFra5;

    private boolean logado;
    int id;

    public void pesquisaPokemon(String pesquisado) {
        boolean algumNumero = pesquisado.matches("[+-]?\\d*(\\.\\d+)?");
        lbErro.setVisible(false);

        try {
            if (algumNumero) {
                throw new ExceptionPesquisaNumero();
            }
            int i = 0;
            for (Pokemon p : pokemons) {
                i++;
                if (p.getNome().equalsIgnoreCase(pesquisado)) {
                    pesquisaPokemonEncontrado(Integer.parseInt(p.getNum()), Integer.parseInt(p.getTotal()));
                    break;
                }
                if (i == pokemons.size()) {
                    System.out.println(pokemons.size());
                    pesquisaPokemonNaoEncontrado();
                }
            }
        } catch (ExceptionPesquisaNumero e) {
            e.getMessage();
            if (Integer.parseInt(pesquisado) > pokemons.size() - 1) {
                pesquisaPokemonNaoEncontrado();
            } else {
                pesquisaPokemonEncontrado(Integer.parseInt(pesquisado), Integer.parseInt(pokemons.get(Integer.parseInt(pesquisado)).getTotal()));
            }
        }
    }

    public void pesquisaPokemonEncontrado(int pokemon, int total) {
        configurarUsuarios();
        configurarPokemons();
        if (pokemon > 151) {
            int i = Integer.parseInt(pokemons.get(pokemon).getUser());
            lbNomeNum.setText(pokemons.get(pokemon).getNome() + " Nº" + pokemons.get(pokemon).getNum() + " ( " + users.get(i).getUser() + " )");
            System.out.println(pokemons.get(pokemon).getNome() + " Nº" + pokemons.get(pokemon).getNum() + " ( " + users.get(i).getUser() + " )");
            imgPokemonPesquisado.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(POKEIMG + "ash.png"))));
        } else {
            lbNomeNum.setText(pokemons.get(pokemon).getNome() + " Nº" + pokemons.get(pokemon).getNum());
            System.out.println(pokemons.get(pokemon).getNome() + " Nº" + pokemons.get(pokemon).getNum());
            String urlImg = POKEIMG + pokemons.get(pokemon).getNum() + ".png";
            imgPokemonPesquisado.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(urlImg))));
        }

        lbPokedex.setVisible(false);
        pStatus.setVisible(true);

        setFraquezas(pokemons.get(pokemon).getTip1(), pokemons.get(pokemon).getTip2());

        int hp = Integer.parseInt(pokemons.get(pokemon).getHp());
        int ata = Integer.parseInt(pokemons.get(pokemon).getAtaque());
        int def = Integer.parseInt(pokemons.get(pokemon).getDefesa());
        int ataEsp = Integer.parseInt(pokemons.get(pokemon).getAtaqueE());
        int defEsp = Integer.parseInt(pokemons.get(pokemon).getDefesaE());
        int speed = Integer.parseInt(pokemons.get(pokemon).getVeloc());

        int t = total / ((String.valueOf(total / 6)).length() + 1);

        pbHp.setProgress((double) hp / t);
        pbAta.setProgress((double) ata / t);
        pbDef.setProgress((double) def / t);
        pbAtaEsp.setProgress((double) ataEsp / t);
        pbDefEsp.setProgress((double) defEsp / t);
        pbSpeed.setProgress((double) speed / t);

        lbHp.setText(String.valueOf(hp));
        lbAta.setText(String.valueOf(ata));
        lbDef.setText(String.valueOf(def));
        lbAtaEsp.setText(String.valueOf(ataEsp));
        lbDefEsp.setText(String.valueOf(defEsp));
        lbSpeed.setText(String.valueOf(speed));
    }

    public void setFraquezas(String tip1, String tip2) {
        ArrayList<String> fraquezasAUX;
        pTip2.setVisible(false);
        pFra1.setVisible(false);
        pFra2.setVisible(false);
        pFra3.setVisible(false);
        pFra4a.setVisible(false);
        pFra4b.setVisible(false);
        pFra5.setVisible(false);

        if (Objects.equals(tip2, "")) {
            fraquezasAUX = fraco(tip1);
        } else {
            fraquezasAUX = fraco(tip1, tip2);
            if (fraquezasAUX.contains(tip1) || fraquezasAUX.contains(tip2)) {
                fraquezasAUX.remove(tip1);
                fraquezasAUX.remove(tip2);
            }
            String corTip2 = "COR" + tip2;
            pTip2.setVisible(true);
            lbTip2.setText(tip2);
            recTip2.setStyle("-fx-fill:" + selecCor(corTip2, false) + ";");
            lbTip2.setStyle("-fx-text-fill:" + selecCor(corTip2, true) + ";");
        }
        String corTip1 = "COR" + tip1;
        pTip1.setVisible(true);
        lbTip1.setText(tip1);
        recTip1.setStyle("-fx-fill:" + selecCor(corTip1, false) + ";");
        lbTip1.setStyle("-fx-text-fill:" + selecCor(corTip1, true) + ";");

        if (fraquezasAUX.size() > 0) {
            String corFra1 = "COR" + fraquezasAUX.get(0);
            pFra1.setVisible(true);
            lbFra1.setText(fraquezasAUX.get(0));
            recFra1.setStyle("-fx-fill:" + selecCor(corFra1, false) + ";");
            lbFra1.setStyle("-fx-text-fill:" + selecCor(corFra1, true) + ";");
        }
        if (fraquezasAUX.size() > 1) {
            String corFra2 = "COR" + fraquezasAUX.get(1);
            pFra2.setVisible(true);
            lbFra2.setText(fraquezasAUX.get(1));
            recFra2.setStyle("-fx-fill:" + selecCor(corFra2, false) + ";");
            lbFra2.setStyle("-fx-text-fill:" + selecCor(corFra2, true) + ";");
        }
        if (fraquezasAUX.size() > 2) {
            String corFra3 = "COR" + fraquezasAUX.get(2);
            pFra3.setVisible(true);
            lbFra3.setText(fraquezasAUX.get(2));
            recFra3.setStyle("-fx-fill:" + selecCor(corFra3, false) + ";");
            lbFra3.setStyle("-fx-text-fill:" + selecCor(corFra3, true) + ";");
        }
        String corFra4;
        if (fraquezasAUX.size() == 4) {
            corFra4 = "COR" + fraquezasAUX.get(3);
            pFra4a.setVisible(true);
            lbFra4.setText(fraquezasAUX.get(3));
            recFra4.setStyle("-fx-fill:" + selecCor(corFra4, false) + ";");
            lbFra4.setStyle("-fx-text-fill:" + selecCor(corFra4, true) + ";");
        }
        if (fraquezasAUX.size() == 5) {
            corFra4 = "COR" + fraquezasAUX.get(3);
            String corFra5 = "COR" + fraquezasAUX.get(4);
            pFra4b.setVisible(true);
            lbFra4.setText(fraquezasAUX.get(3));
            pFra5.setVisible(true);
            lbFra5.setText(fraquezasAUX.get(4));
            recFra4.setStyle("-fx-fill:" + selecCor(corFra4, false) + ";");
            lbFra4.setStyle("-fx-text-fill:" + selecCor(corFra4, true) + ";");
            recFra5.setStyle("-fx-fill:" + selecCor(corFra5, false) + ";");
            lbFra5.setStyle("-fx-text-fill:" + selecCor(corFra5, true) + ";");
        }
    }

    public String selecCor(String cor, boolean txt) {
        switch (cor) {
            case "CORGrass" -> {
                if (!txt) {
                    return CORGrass;
                }
                else {
                    return CORTXTP;
                }
            }
            case "CORSteel" -> {
                if (!txt) {
                    return CORSteel;
                } else {
                    return CORTXTP;
                }
            }
            case "CORWater" -> {
                if (!txt) {
                    return CORWater;
                } else {
                    return CORTXTB;
                }
            }
            case "CORDragon" -> {
                if (!txt) {
                    return CORDragon;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORElectric" -> {
                if (!txt) {
                    return CORElectric;
                }
                else {
                    return CORTXTP;
                }
            }
            case "CORFairy" -> {
                if (!txt) {
                    return CORFairy;
                }
                else {
                    return CORTXTP;
                }
            }
            case "CORGhost" -> {
                if (!txt) {
                    return CORGhost;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORFire" -> {
                if (!txt) {
                    return CORFire;
                }
                else {
                    return CORTXTB;
                }
            }

            case "CORIce" -> {
                if (!txt) {
                    return CORIce;
                }
                else {
                    return CORTXTP;
                }
            }
            case "CORBug" -> {
                if (!txt) {
                    return CORBug;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORFighting" -> {
                if (!txt) {
                    return CORFighting;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORNormal" -> {
                if (!txt) {
                    return CORNormal;
                }
                else {
                    return CORTXTP;
                }
            }
            case "CORRock" -> {
                if (!txt) {
                    return CORRock;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORPsychic" -> {
                if (!txt) {
                    return CORPsychic;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORDark" -> {
                if (!txt) {
                    return CORDark;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORGround" -> {
                if (!txt) {
                    return CORGround;
                }
                else {
                    return CORTXTP;
                }
            }

            case "CORPoison" -> {
                if (!txt) {
                    return CORPoison;
                }
                else {
                    return CORTXTB;
                }
            }
            case "CORFlying" -> {
                if (!txt) {
                    return CORFlying;
                }
                else {
                    return CORTXTP;
                }
            }
        }
        return "none";
    }

    public void pesquisaPokemonNaoEncontrado() {
        lbErro.setText("Pokemon não encontrado");
        System.out.println("Pokemon não encontrado");
        lbErro.setVisible(true);
        btnPesquisarLimpo();
        tfPesquisaPokemon.clear();
    }

    public void btnPesquisarLimpo() {
        imgPokemonPesquisado.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(POKEIMG + "ash.png"))));
        lbNomeNum.setText("");
        lbPokedex.setVisible(true);
        pStatus.setVisible(false);
    }

    public void pesquisavel() {
        if (!Objects.equals(tfPesquisaPokemon.getText(), "")) {
            String pesquisa = tfPesquisaPokemon.getText();
            System.out.println("Pesquisar Pokemon " + pesquisa);
            pesquisaPokemon(pesquisa);
            tfPesquisaPokemon.clear();
        } else {
            btnPesquisarLimpo();
        }
    }

    public void btnPesquisar() {
        pesquisavel();
    }

    public void btnUser() {
        if (logado) {
            System.out.println("Olá " + users.get(id).getUser() + ", você já está logado");
            alertInform("Logado", "Olá " + users.get(id).getUser() + ", você já está logado");
        } else {
            Main.changeScreen("login");
            System.out.println("Logar");
        }
    }

    public void btnAbout() {
        alertInform("Sobre", SOBRETXT);
    }

    public void tfPesquisaPokemon() {
        lbErro.setVisible(false);
    }

    public void btnAddPokemon() {
        if (logado) {
            Main.changeScreen("adPoke", id);
            System.out.println("Adicionar Pokemon");
        } else {
            System.out.println("Como você consegue ver esse botão?");
        }
    }

    public void tfPesquisaPokemonNxt(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            pesquisavel();
        }
    }
}
