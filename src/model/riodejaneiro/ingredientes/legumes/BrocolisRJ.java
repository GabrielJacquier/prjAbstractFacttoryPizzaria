/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.legumes;

import model.comum.ingredientes.legumes.Brocolis;

/**
 *
 * @author gabriel
 */
public class BrocolisRJ extends Brocolis {

    public BrocolisRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Brocolis do Rio";
    }

    @Override
    public Double getPrecoKilo() {
        return 22D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 300D;
    }
    
}
