/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Wagner
 */
public class DataControle {
    
    
    private final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public DataControle(){
        
    }
    
    public int getIdade(LocalDate dataEntrada){ //Vai retornar -1 , se der error !
        
        if (dataEntrada == null) {
            return -1;
        }else{
            return Math.abs(dataEntrada.getYear() - LocalDate.now().getYear());
        }
        
    }
    
    public String getDataBR(LocalDate localDate){ //Vai retornar null se der error.
        
        if (localDate == null) {
            return null;
        }else{
            return localDate.format(this.getFormatador());
        }
        
    }
    
    public String getDataGringo(String inputData){
        
        if (inputData == null) {
            return null;
        }else{
            LocalDate ld = LocalDate.parse(inputData, this.getFormatador());
            return ld.toString();
        }
        
    }

    /**
     * @return the formatador
     */
    public DateTimeFormatter getFormatador() {
        return formatador;
    }
}
