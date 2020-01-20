package br.edu.ifal.controle;

import br.edu.ifal.modelo.*;

public class ControleLeilao{
    public boolean validarLance(Lance novoLance, Leilao leilao){
        boolean validade = false;
        if(novoLance.getValor() >= leilao.getValorMinimo())
            validade = true;
        return validade;
        
    }
}