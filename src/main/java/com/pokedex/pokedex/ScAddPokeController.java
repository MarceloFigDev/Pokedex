package com.pokedex.pokedex;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Objects;
import java.util.Optional;

public class ScAddPokeController extends Pokedex {
    @FXML
    protected void initialize() {

        Main.addOnChegeScreenListener((newScreen, userData) -> {
            //Acontecer quando trocar de tela
            if (userData == null) {
                id = 0;
            } else {
                id = (int) userData;
            }
            setStatus();
        });
    }

    Alert alertInform = new Alert(Alert.AlertType.INFORMATION);

    public void alertInformCadastro(String nome) {
        alertInform.setTitle("Adicionado");
        alertInform.setHeaderText("");
        alertInform.setContentText("O pokemon " + nome + " foi adicionado na pokedex.\n\nÉ preciso reiniciar o app para atualizar a pokedex");
        Optional<ButtonType> sair = alertInform.showAndWait();

        if (sair.isPresent() && sair.get() == ButtonType.OK) {
            System.exit(0);
        }

        alertInform.show();
    }

    @FXML
    private Label lbPokeC;
    @FXML
    private Label lbTip1;
    @FXML
    private Label lbTip2;
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
    private TextField tfNome;
    @FXML
    private TextField tfHp;
    @FXML
    private TextField tfAta;
    @FXML
    private TextField tfDef;
    @FXML
    private TextField tfSpd;
    @FXML
    private Slider sldHp;
    @FXML
    private Slider sldAta;
    @FXML
    private Slider sldDef;
    @FXML
    private Slider sldSpd;
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

    private String escTipo1;
    private String escTipo2;
    private int id;

    public void verificarSePokemonCadastravel() {
        boolean nomeC;
        boolean tipoC;
        boolean algumNumero = tfNome.getText().matches("[+-]?\\d*(\\.\\d+)?");

        try {
            if (algumNumero) {
                throw new ExceptionPokemonSoNumeros();
            }
            if (Objects.equals(tfNome.getText(), "")) {
                System.out.println("Quem é esse pokemon?");
                lbPokeC.setText("Quem é esse pokemon?");
                lbPokeC.setVisible(true);
                nomeC = false;
            } else {
                conferirExistenciaPokemon(tfNome.getText());
                try {
                    if (conferirExisteciaPokemon) {
                        throw new ExceptionPokemonExiste();
                    }
                    System.out.println("Nova espécie pokemon");
                    nomeC = true;
                } catch (ExceptionPokemonExiste e) {
                    e.getMessage();
                    tfNome.clear();
                    lbPokeC.setText("Esse pokemon já existe");
                    lbPokeC.setVisible(true);
                    nomeC = false;
                }

                if (Objects.equals(escTipo1, escTipo2)) {
                    escTipo2 = null;
                }

                if (escTipo1 == null && escTipo2 != null) {
                    escTipo1 = escTipo2;
                    escTipo2 = null;
                }

                if (escTipo1 == null) {
                    System.out.println("Selecione os tipos");
                    lbPokeC.setText("Selecione os tipos");
                    lbPokeC.setVisible(true);
                    tipoC = false;
                } else {
                    System.out.println("Tipos selecionados");
                    tipoC = true;
                }

                if (nomeC && tipoC) {
                    System.out.println("Pokemon adicionado na pokedex");
                    if (escTipo2 == null) {
                        adicionar(tfNome.getText(), escTipo1, Integer.parseInt(lbHp.getText()), Integer.parseInt(lbAta.getText()), Integer.parseInt(lbDef.getText()), Integer.parseInt(lbAtaEsp.getText()), Integer.parseInt(lbDefEsp.getText()), Integer.parseInt(lbSpeed.getText()));
                    } else {
                        adicionar(tfNome.getText(), escTipo1, escTipo2, Integer.parseInt(lbHp.getText()), Integer.parseInt(lbAta.getText()), Integer.parseInt(lbDef.getText()), Integer.parseInt(lbAtaEsp.getText()), Integer.parseInt(lbDefEsp.getText()), Integer.parseInt(lbSpeed.getText()));
                    }
                } else {
                    System.out.println("Erro ao adicionar novo pokemon");
                }
            }
        } catch (ExceptionPokemonSoNumeros e) {
            e.getMessage();
            lbPokeC.setText("O nome deve conter letras");
            lbPokeC.setVisible(true);
            tfNome.clear();
        }
    }

    public void adicionar(String nome, String tip1, int hp, int ataque, int defesa, int ataqueE, int defesaE, int veloc) {
        adicionar(nome, tip1, null, hp, ataque, defesa, ataqueE, defesaE, veloc);
    }

    public void zerarValores(){
        tfNome.clear();
        sldHp.setValue(75);
        sldAta.setValue(75);
        sldDef.setValue(75);
        sldSpd.setValue(75);

        sldHp.setMax(150);
        sldAta.setMax(150);
        sldDef.setMax(150);
        sldSpd.setMax(150);

        selecionarTipo1("");
        selecionarTipo2("");
    }

    public void adicionar(String nome, String tip1, String tip2, int hp, int ataque, int defesa, int ataqueE, int defesaE, int veloc) {
        zerarValores();

        int total = hp + ataque + defesa + ataqueE + defesaE + veloc;
        int num = pokemons.size();

        if (Pokedex.addPokemon(num, nome, tip1, tip2, total, hp, ataque, defesa, ataqueE, defesaE, veloc, id)) {
            System.out.println("Pokemon " + nome + " adicionado na pokedex com sucesso");
            alertInformCadastro(nome);
        } else {
            System.out.println("Erro ao adicionar pokemon");
        }
    }

    public void btnVoltar() {
        zerarValores();
        Main.changeScreen("home", id);
        System.out.println("Voltar");
    }

    public void setStatus() {
        int stHp = (int) sldHp.getValue();
        int stAta = (int) sldAta.getValue();
        int stDef = (int) sldDef.getValue();
        int stAtaEsp = (int) (stAta * 1.3);
        int stDefEsp = (int) (stDef * 1.3);
        int stSpd = (int) sldSpd.getValue();

        if (stHp > 75) {
            sldSpd.setMax(150 - (stHp - 75));
        }

        if (stSpd > 75) {
            sldHp.setMax(150 - (stSpd - 75));
        }

        if (stAta > 75) {
            sldDef.setMax(150 - (stAta - 75));
        }

        if (stDef > 75) {
            sldAta.setMax(150 - (stDef - 75));
        }

        tfHp.setPromptText(String.valueOf(stHp));
        tfAta.setPromptText(String.valueOf(stAta));
        tfDef.setPromptText(String.valueOf(stDef));
        tfSpd.setPromptText(String.valueOf(stSpd));

        lbHp.setText(String.valueOf(stHp));
        lbAta.setText(String.valueOf(stAta));
        lbDef.setText(String.valueOf(stDef));
        lbAtaEsp.setText(String.valueOf(stAtaEsp));
        lbDefEsp.setText(String.valueOf(stDefEsp));
        lbSpeed.setText(String.valueOf(stSpd));

        pbHp.setProgress((double) stHp / 150);
        pbAta.setProgress((double) stAta / 150);
        pbDef.setProgress((double) stDef / 150);
        pbAtaEsp.setProgress((double) stAtaEsp / 150);
        pbDefEsp.setProgress((double) stDefEsp / 150);
        pbSpeed.setProgress((double) stSpd / 150);
    }

    public void tfHp(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sldHp.setValue(Double.parseDouble(tfHp.getText()));
            tfHp.clear();
            setStatus();
        }
    }

    public void tfAta(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sldAta.setValue(Double.parseDouble(tfAta.getText()));
            tfAta.clear();
            setStatus();
        }
    }

    public void tfDef(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sldDef.setValue(Double.parseDouble(tfDef.getText()));
            tfDef.clear();
            setStatus();
        }
    }

    public void tfSpd(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sldSpd.setValue(Double.parseDouble(tfSpd.getText()));
            tfSpd.clear();
            setStatus();
        }
    }

    public void sldHp() {
        setStatus();
    }

    public void sldAta() {
        setStatus();
    }

    public void sldDef() {
        setStatus();
    }

    public void sldSpd() {
        setStatus();
    }

    public void tfNome() {
        lbPokeC.setVisible(false);
    }

    public void selecionarTipo1(String tipo) {
        if (Objects.equals(tipo, "")){
            lbPokeC.setVisible(false);
            escTipo1 = null;
            lbTip1.setText("Tipo 1");
        } else {
            lbPokeC.setVisible(false);
            escTipo1 = tipo;
            lbTip1.setText("Tipo 1 - " + tipo);
        }
    }

    public void selecionarTipo2(String tipo) {
        if (Objects.equals(tipo, "")){
            lbPokeC.setVisible(false);
            escTipo2 = null;
            lbTip2.setText("Tipo 2");
        } else {
            lbPokeC.setVisible(false);
            escTipo2 = tipo;
            lbTip2.setText("Tipo 2 - " + tipo);
        }
    }

    public void btnCadastrar() {
        verificarSePokemonCadastravel();
    }

    public void miTGrass1() {
        selecionarTipo1("Grass");
    }

    public void miTSteel1() {
        selecionarTipo1("Steel");
    }

    public void miTWater1() {
        selecionarTipo1("Water");
    }

    public void miTDragon1() {
        selecionarTipo1("Dragon");
    }

    public void miTElectric1() {
        selecionarTipo1("Electric");
    }

    public void miTFairy1() {
        selecionarTipo1("Fairy");
    }

    public void miTGhost1() {
        selecionarTipo1("Ghost");
    }

    public void miTFire1() {
        selecionarTipo1("Fire");
    }

    public void miTIce1() {
        selecionarTipo1("Ice");
    }

    public void miTBug1() {
        selecionarTipo1("Bug");
    }

    public void miTFighting1() {
        selecionarTipo1("Fighting");
    }

    public void miTNormal1() {
        selecionarTipo1("Normal");
    }

    public void miTRock1() {
        selecionarTipo1("Rock");
    }

    public void miTPsychic1() {
        selecionarTipo1("Psychic");
    }

    public void miTDark1() {
        selecionarTipo1("Dark");
    }

    public void miTGround1() {
        selecionarTipo1("Ground");
    }

    public void miTPoison1() {
        selecionarTipo1("Poison");
    }

    public void miTFlying1() {
        selecionarTipo1("Flying");
    }

    public void miTGrass2() {
        selecionarTipo2("Grass");
    }

    public void miTSteel2() {
        selecionarTipo2("Steel");
    }

    public void miTWater2() {
        selecionarTipo2("Water");
    }

    public void miTDragon2() {
        selecionarTipo2("Dragon");
    }

    public void miTElectric2() {
        selecionarTipo2("Electric");
    }

    public void miTFairy2() {
        selecionarTipo2("Fairy");
    }

    public void miTGhost2() {
        selecionarTipo2("Ghost");
    }

    public void miTFire2() {
        selecionarTipo2("Fire");
    }

    public void miTIce2() {
        selecionarTipo2("Ice");
    }

    public void miTBug2() {
        selecionarTipo2("Bug");
    }

    public void miTFighting2() {
        selecionarTipo2("Fighting");
    }

    public void miTNormal2() {
        selecionarTipo2("Normal");
    }

    public void miTRock2() {
        selecionarTipo2("Rock");
    }

    public void miTPsychic2() {
        selecionarTipo2("Psychic");
    }

    public void miTDark2() {
        selecionarTipo2("Dark");
    }

    public void miTGround2() {
        selecionarTipo2("Ground");
    }

    public void miTPoison2() {
        selecionarTipo2("Poison");
    }

    public void miTFlying2() {
        selecionarTipo2("Flying");
    }
}
