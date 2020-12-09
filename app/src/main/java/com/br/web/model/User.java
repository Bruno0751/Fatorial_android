package com.br.web.model;

import android.widget.ImageView;

public class User {

    private ImageView exit, calculate;
    private double valor, resposta = 1;

    public User() {
    }

    public ImageView getExit() {
        return exit;
    }

    public void setExit(ImageView exit) {
        this.exit = exit;
    }

    public ImageView getCalculate() {
        return calculate;
    }

    public void setCalculate(ImageView calculate) {
        this.calculate = calculate;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResposta() {
        return resposta;
    }

    public void setResposta(double resposta) {
        this.resposta = resposta;
    }
}
