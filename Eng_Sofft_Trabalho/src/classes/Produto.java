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
public class Produto {
    
    
    private String nome; //Nome do produto
    private String marca; //Marca do Produto
    
    private int qtdTamanho_P;//Quantidade tamanho P
    private int qtdTamanho_M;//Quantidade tamanho M
    private int qtdTamanho_G;//Quantidade tamanho G
    
    private int grupo;
    
    private double valor;
    
    public Produto(){
        
    }
    
    public int getQuantidadeTotalProduto(){
        return ( this.getQtdTamanho_P() + this.getQtdTamanho_M() + this.getQtdTamanho_G()) ;
    }
    
    
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the qtdTamanho_P
     */
    public int getQtdTamanho_P() {
        return qtdTamanho_P;
    }

    /**
     * @param qtdTamanho_P the qtdTamanho_P to set
     */
    public void setQtdTamanho_P(int qtdTamanho_P) {
        this.qtdTamanho_P = qtdTamanho_P;
    }

    /**
     * @return the qtdTamanho_M
     */
    public int getQtdTamanho_M() {
        return qtdTamanho_M;
    }

    /**
     * @param qtdTamanho_M the qtdTamanho_M to set
     */
    public void setQtdTamanho_M(int qtdTamanho_M) {
        this.qtdTamanho_M = qtdTamanho_M;
    }

    /**
     * @return the qtdTamanho_G
     */
    public int getQtdTamanho_G() {
        return qtdTamanho_G;
    }

    /**
     * @param qtdTamanho_G the qtdTamanho_G to set
     */
    public void setQtdTamanho_G(int qtdTamanho_G) {
        this.qtdTamanho_G = qtdTamanho_G;
    }

    /**
     * @return the grupo
     */
    public int getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
