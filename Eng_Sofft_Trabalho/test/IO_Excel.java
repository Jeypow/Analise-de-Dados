/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.IOExcel;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Wagner
 */
public class IO_Excel {
    
    @Test
    public void verificarArquivo(){
        
        IOExcel io = new IOExcel("G:\\Pasta Eng\\xccx.xlsx");
        
        io.init();
        
        boolean ok = io.lerExcel();
        
        
        Assert.assertEquals(true, ok);
    }
}
