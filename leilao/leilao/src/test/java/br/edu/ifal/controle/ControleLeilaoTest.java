package br.edu.ifal.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifal.modelo.*;

public class ControleLeilaoTest{
    @Test
    public void deveRetornarVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2501);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = true;
        assertEquals(validadeEsperada, validadeRetornada);
    }

    @Test
    public void deveRetornarFalsoParaUmLanceMenorQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2000);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = false;
        assertEquals(validadeEsperada, validadeRetornada);
    }

    @Test
    public void deveRetornarVerdadeiroParaUmLanceIgualQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2500);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = true;
        assertEquals(validadeEsperada, validadeRetornada);
    }
}