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
 * @author wmfjunior
 */
public class Ajuda {
    
    
    private List<String> listgrupo; //Tipos de grupo
    
    public Ajuda(){
        
    }
    
    public void init(){
        
        this.listgrupo = new ArrayList<>();
        this.listgrupo.add("sapato");
        this.listgrupo.add("calca");
        this.listgrupo.add("camisa");
        this.listgrupo.add("oculos");
        this.listgrupo.add("sandalia");
        this.listgrupo.add("coeca");
        
    }
    
    public List ordenarPelaData(String ordem , List lista){ //
        
        if (lista != null) {
            
            if (ordem.equalsIgnoreCase("menor-maior")) {
            
            }else{
            
            }
            
        }
        
        return null;
    }
}
