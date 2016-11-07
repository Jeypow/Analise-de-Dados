/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author Wagner
 */
public class Vendas {
    
    //Vendedor
    private String nomeVendedor;
    //---------------------------------------------------
    
    //Comprador
    private String nomeComprador;
    private String sexoComprador;
    private String estadoComprador;
    private LocalDate dataNascimentoComprador;
    //--------------------------------------------------
    
    //Produto
    private String nomeProduto;
    private String marcaProduto;
    private int qtdTamanho_P_Produto;
    private int qtdTamanho_M_Produto;
    private int qtdTamanho_G_Produto;
    private int grupoProduto;
    private double valorProduto;
    //---------------------------------------------------
    
    //Pagamento
    private boolean tipoPagamento;
    private String debOrCredPagamento;
    private String bandeiraCartaoPagamento;
    private int numeroParcelasPagamento;
    //---------------------------------------------------

    //GETERS E SETERS
    
    /**
     * @return the nomeVendedor
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     * @param nomeVendedor the nomeVendedor to set
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    /**
     * @return the nomeComprador
     */
    public String getNomeComprador() {
        return nomeComprador;
    }

    /**
     * @param nomeComprador the nomeComprador to set
     */
    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    /**
     * @return the sexoComprador
     */
    public String getSexoComprador() {
        return sexoComprador;
    }

    /**
     * @param sexoComprador the sexoComprador to set
     */
    public void setSexoComprador(String sexoComprador) {
        this.sexoComprador = sexoComprador;
    }

    /**
     * @return the estadoComprador
     */
    public String getEstadoComprador() {
        return estadoComprador;
    }

    /**
     * @param estadoComprador the estadoComprador to set
     */
    public void setEstadoComprador(String estadoComprador) {
        this.estadoComprador = estadoComprador;
    }

    /**
     * @return the dataNascimentoComprador
     */
    public LocalDate getDataNascimentoComprador() {
        return dataNascimentoComprador;
    }

    /**
     * @param dataNascimentoComprador the dataNascimentoComprador to set
     */
    public void setDataNascimentoComprador(LocalDate dataNascimentoComprador) {
        this.dataNascimentoComprador = dataNascimentoComprador;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the marcaProduto
     */
    public String getMarcaProduto() {
        return marcaProduto;
    }

    /**
     * @param marcaProduto the marcaProduto to set
     */
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    /**
     * @return the qtdTamanho_P_Produto
     */
    public int getQtdTamanho_P_Produto() {
        return qtdTamanho_P_Produto;
    }

    /**
     * @param qtdTamanho_P_Produto the qtdTamanho_P_Produto to set
     */
    public void setQtdTamanho_P_Produto(int qtdTamanho_P_Produto) {
        this.qtdTamanho_P_Produto = qtdTamanho_P_Produto;
    }

    /**
     * @return the qtdTamanho_M_Produto
     */
    public int getQtdTamanho_M_Produto() {
        return qtdTamanho_M_Produto;
    }

    /**
     * @param qtdTamanho_M_Produto the qtdTamanho_M_Produto to set
     */
    public void setQtdTamanho_M_Produto(int qtdTamanho_M_Produto) {
        this.qtdTamanho_M_Produto = qtdTamanho_M_Produto;
    }

    /**
     * @return the qtdTamanho_G_Produto
     */
    public int getQtdTamanho_G_Produto() {
        return qtdTamanho_G_Produto;
    }

    /**
     * @param qtdTamanho_G_Produto the qtdTamanho_G_Produto to set
     */
    public void setQtdTamanho_G_Produto(int qtdTamanho_G_Produto) {
        this.qtdTamanho_G_Produto = qtdTamanho_G_Produto;
    }

    /**
     * @return the grupoProduto
     */
    public int getGrupoProduto() {
        return grupoProduto;
    }

    /**
     * @param grupoProduto the grupoProduto to set
     */
    public void setGrupoProduto(int grupoProduto) {
        this.grupoProduto = grupoProduto;
    }

    /**
     * @return the valorProduto
     */
    public double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    /**
     * @return the tipoPagamento
     */
    public boolean isTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(boolean tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the debOrCredPagamento
     */
    public String getDebOrCredPagamento() {
        return debOrCredPagamento;
    }

    /**
     * @param debOrCredPagamento the debOrCredPagamento to set
     */
    public void setDebOrCredPagamento(String debOrCredPagamento) {
        this.debOrCredPagamento = debOrCredPagamento;
    }

    /**
     * @return the bandeiraCartaoPagamento
     */
    public String getBandeiraCartaoPagamento() {
        return bandeiraCartaoPagamento;
    }

    /**
     * @param bandeiraCartaoPagamento the bandeiraCartaoPagamento to set
     */
    public void setBandeiraCartaoPagamento(String bandeiraCartaoPagamento) {
        this.bandeiraCartaoPagamento = bandeiraCartaoPagamento;
    }

    /**
     * @return the numeroParcelasPagamento
     */
    public int getNumeroParcelasPagamento() {
        return numeroParcelasPagamento;
    }

    /**
     * @param numeroParcelasPagamento the numeroParcelasPagamento to set
     */
    public void setNumeroParcelasPagamento(int numeroParcelasPagamento) {
        this.numeroParcelasPagamento = numeroParcelasPagamento;
    }
    
    
    
    
}
