/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Wagner
 */
public class Vendedor {
    
    
    private String nome;
    
    private int qtdTotalVendas;
    

    //GETERS E SETERS
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtdTotalVendas
     */
    public int getQtdTotalVendas() {
        return qtdTotalVendas;
    }

    /**
     * @param qtdTotalVendas the qtdTotalVendas to set
     */
    public void setQtdTotalVendas(int qtdTotalVendas) {
        this.qtdTotalVendas = qtdTotalVendas;
    }
    
}
