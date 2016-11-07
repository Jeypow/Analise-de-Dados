/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author Wagner
 */
public class CLASSEDETEST {
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
//        DataControle dt = new DataControle();
//        
//        LocalDate x = LocalDate.parse("10/10/1991", dt.getFormatador());
//        
//        System.out.println(x.toString());
//        
//        System.exit(0);
        
        IOExcel io = new IOExcel("G:\\Pasta Eng\\xccx.xlsx");
        io.init();
        io.lerExcel();
        
        ControleTotal c = new ControleTotal();
        
        c.setListVendas(io.getListVendas());
        
        c.separarDados();
        
        System.out.println(c.produtoMaisVendido());
        
        System.exit(0);
        
        String file = "G:\\Pasta Eng\\ModeloDeCompra.xlsx";
        
        FileInputStream fis = new FileInputStream(new File(file));
        
        //create workbook instance
        
        XSSFWorkbook wb = new XSSFWorkbook(file);
        
        XSSFSheet sheet = wb.getSheetAt(0);
        
        //List<String> list = new ArrayList<>();
        
        List<List<String>> matriz = new ArrayList<>();
        
        int cont;
        
        List<String> l = new ArrayList<>();
        for(Row row: sheet){
            
            
            for(Cell cell: row){
                l.add(cell.getStringCellValue().trim().toLowerCase());
            }
            break;
            
            //matriz.add(list);
        }
        
        Comprador c = new Comprador();
        
        Produto p = new Produto();
             
        p.setNome(l.get(5));
        p.setMarca(l.get(6));
        p.setQtdTamanho_P(Integer.parseInt(l.get(7)));
        p.setQtdTamanho_M(Integer.parseInt(l.get(8)));
        p.setQtdTamanho_G(Integer.parseInt(l.get(9)));
        p.setGrupo(Integer.parseInt(l.get(10)));
        p.setValor(Double.parseDouble(l.get(11)));
        
        System.out.println("Produto:\n");
        
        System.out.println(p.getNome());
        System.out.println(p.getMarca());
        System.out.println(p.getQtdTamanho_P());
        System.out.println(p.getQtdTamanho_M());
        System.out.println(p.getQtdTamanho_G());
        System.out.println(p.getGrupo());
        System.out.println(p.getValor());
        
        System.out.println("Total De Produtos : "+p.getQuantidadeTotalProduto());
        
    }
    
}
