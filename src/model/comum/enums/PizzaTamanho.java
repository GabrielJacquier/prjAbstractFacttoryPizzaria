/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gabriel
 */
public enum PizzaTamanho {
    BROTO(20D, "Broto"),
    MEDIA(50D, "Média"),
    GRANDE(100D, "Grande"),
    EXTRAGRANDE(150D, "Extra Grande");

    private Double porcentagem;
    private String label;

    PizzaTamanho(Double porcentagem, String label) {
        this.porcentagem = porcentagem;
        this.label = label;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }
    
        public String getLabel() {
        return label;
    }
    
    public static List<PizzaTamanho> valuesList() {
        return Arrays.stream(PizzaTamanho.values()).collect(Collectors.toList());
    }

    public static PizzaTamanho getEnum(String label) {
        List<PizzaTamanho> pizzas = Arrays.stream(PizzaTamanho.values()).collect(Collectors.toList());
        return pizzas.stream().filter(pizza -> pizza.getLabel().equals(label)).findFirst().get();
    }
}
