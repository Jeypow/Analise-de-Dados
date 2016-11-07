/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.ControleTotal;
import classes.IOExcel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wagner
 */
public class Test_ControleProdutos {
    
    @Test
    public void produtoMaisVendido(){
        
        IOExcel io = new IOExcel("G:\\Pasta Eng\\xccx.xlsx");
        io.init();
        io.lerExcel();
        
        ControleTotal c = new ControleTotal();
        
        c.setListVendas(io.getListVendas());
        
        c.separarDados();
        
        String vendido = "oculos";
        
        Assert.assertEquals(vendido,c.produtoMaisVendido() );
        
        
        
    }
    
}
