/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wagner
 */
public class ControleTotal {
    
    
    private List <Comprador> listComprador;
    private List <Vendedor>  listVendedor;
    private List <Vendas>    listVendas;
    private List<Produto>    listProduto;
    
    public ControleTotal(){
        
        init();
        
    }
    
    public void init(){ //Primeira Funcao que vai iniciar
        
        this.listComprador = new ArrayList<>();
        this.listVendedor  = new ArrayList<>();
        this.setListVendas(new ArrayList<>());
        this.listProduto = new ArrayList<>();
        
    }
    
    public void separarDados(){
        
        for(Vendas forVendas: this.listVendas){
            
            //Produto
            Produto p = new Produto();
            
            p.setNome(forVendas.getNomeProduto());
            p.setMarca(forVendas.getMarcaProduto());
            p.setQtdTamanho_P(forVendas.getQtdTamanho_P_Produto());
            p.setQtdTamanho_M(forVendas.getQtdTamanho_M_Produto());
            p.setQtdTamanho_G(forVendas.getQtdTamanho_G_Produto());
            p.setGrupo(forVendas.getGrupoProduto());
            p.setValor(forVendas.getValorProduto());
            
            verificarEADDProduto(p);
            
            //-----------------------------------------------------------
            
            //Comprador
            Comprador c = new Comprador();
            
            c.setNome(forVendas.getNomeComprador());
            c.setEstado(forVendas.getEstadoComprador());
            c.setSexo(forVendas.getSexoComprador());
            c.setDataNascimento(forVendas.getDataNascimentoComprador());
            
            verificarEAddComprador(c);
            //-----------------------------------------------------------
            
            //Vendedor
            Vendedor v = new Vendedor();
            
            v.setNome(forVendas.getNomeVendedor());
            
            verificarEAddVendedor(v , p.getQuantidadeTotalProduto());
            
            //-----------------------------------------------------------
            
        }
        
    }
    
    public void verificarEADDProduto(Produto pInput){
        
        for(Produto p: this.listProduto){
            if (p.getNome().equalsIgnoreCase(pInput.getNome())) {
                if (p.getMarca().equalsIgnoreCase(pInput.getMarca())) {
                    p.setQtdTamanho_P(pInput.getQtdTamanho_P());
                    p.setQtdTamanho_M(pInput.getQtdTamanho_M());
                    p.setQtdTamanho_G(pInput.getQtdTamanho_G());
                    return;
                }
            }
        }
        
        this.listProduto.add(pInput);
        
    }
    
    public void verificarEAddVendedor(Vendedor vInput , int totalVendas){
        
        for(Vendedor forVendedor: this.listVendedor){
            if (forVendedor.getNome().equalsIgnoreCase(vInput.getNome())) {
                forVendedor.setQtdTotalVendas(forVendedor.getQtdTotalVendas() + totalVendas);
                return;
            }
        }
        
        vInput.setQtdTotalVendas(totalVendas);
        this.listVendedor.add(vInput);
        
    }
    
    public void verificarEAddComprador(Comprador cInput){
        
        for(Comprador forComp: this.listComprador){
            if (forComp.getNome().equalsIgnoreCase(cInput.getNome())) {
                return;
            }
        }
        
        this.listComprador.add(cInput);
        
    }
    
    public String produtoMaisVendido(){
        
        if (this.listProduto.isEmpty()) {
            return "Não existe produto cadastrado.";
        }
        
        Produto p = this.listProduto.get(0);
        
        for(Produto forP: this.listProduto){
            if (forP.getQuantidadeTotalProduto() > p.getQuantidadeTotalProduto()) {
                p = forP;
            }
        }
        
        return p.getNome();
        //return p.getNome()+"\n"+p.getMarca()+"\n"+p.getQuantidadeTotalProduto();
        
    }

    /**
     * @param listVendas the listVendas to set
     */
    public void setListVendas(List <Vendas> listVendas) {
        this.listVendas = listVendas;
    }
    
}

//####################################### _ANOTACOES_ ##############################################

//Tipo de dados:
//Nome Variavel = tipo
//------> 1 = Classe Comprador
//------> 2 = Classe Vendedor
//------> 3 = Classe Produto


//Cliente só vai poder comprar se o mesmo ja estiver cadastrado no ssitema
//O mesmo para o vendedor

//O arquivo excel vai do ( 0 ao 15 ) ==>:

//  0 = Vendedor
//  1 ao 4 = Comprador
//  5 ao 11 = Produto
//  12 ao 15 = Pagamento

//###################################################################################################