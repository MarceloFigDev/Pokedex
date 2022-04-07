package com.pokedex.pokedex;

public class Pokemon {
    private String num;
    private String nome;
    private String tip1;
    private String tip2;
    private String total;
    private String hp;
    private String ataque;
    private String defesa;
    private String ataqueE;
    private String defesaE;
    private String veloc;
    private String user;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1;
    }

    public String getTip2() {
        return tip2;
    }

    public void setTip2(String tip2) {
        this.tip2 = tip2;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAtaqueE() {
        return ataqueE;
    }

    public void setAtaqueE(String ataqueE) {
        this.ataqueE = ataqueE;
    }

    public String getDefesaE() {
        return defesaE;
    }

    public void setDefesaE(String defesaE) {
        this.defesaE = defesaE;
    }

    public String getVeloc() {
        return veloc;
    }

    public void setVeloc(String veloc) {
        this.veloc = veloc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return num +
                " | " + nome +
                " | Tipo: " + tip1 +
                " | Tipo 2: " + tip2 +
                " | Total: " + total +
                " | HP: " + hp +
                " | Ataque: " + ataque +
                " | Defesa: " + defesa +
                " | Ataque Esp.: " + ataqueE +
                " | Defesa Esp.: " + defesaE +
                " | Velocidade: " + veloc;
    }
}
