/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Wagner
 */
public class IOExcel {
    
    private List <Vendas>    listVendas;
    
    private int numeroDeRegistros;
    
    private File fileExcel;
    
    public IOExcel(String filePath ){
        
        this.fileExcel = new File(filePath);
        init();
        
    }
    
    public void init(){//Primeira funcao a se chamar Lembre-se
        
        this.listVendas    = new ArrayList<>();
        
    }
    
    //Segunda funcao a se chamar
    public boolean verificarArquivo(){  //Vai verificar se o diretorio existe
        
        return true;
        
    }
    
    public List<Vendas> pegarDados(){
        if (lerExcel()) {
            return this.getListVendas();
        }else{
            return null;
        }
    }
    
    public boolean lerExcel(){ 
        
        try{
            
            FileInputStream fis = new FileInputStream(this.getFileExcel());
            
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            
            for(Row row: sheet){
                
                List<String> list = new ArrayList<>();
                
                for(Cell cell: row){
                    list.add(cell.getStringCellValue().trim());
                }
              
                if (list.size() >= 15) {
                    
                    Vendas venda = new Vendas();
                
                    //Vendedor
                    venda.setNomeVendedor(list.get(0));

                    //Comprador
                    venda.setNomeComprador(list.get(1));
                    venda.setSexoComprador(list.get(2));
                    venda.setEstadoComprador(list.get(3));
                    venda.setDataNascimentoComprador(LocalDate.parse(list.get(4), new DataControle().getFormatador()));

                    //Produto
                    venda.setNomeProduto(list.get(5));
                    venda.setMarcaProduto(list.get(6));

                    venda.setQtdTamanho_P_Produto(Integer.parseInt(list.get(7)));
                    venda.setQtdTamanho_M_Produto(Integer.parseInt(list.get(8)));
                    venda.setQtdTamanho_G_Produto(Integer.parseInt(list.get(9)));

                    venda.setGrupoProduto((Integer.parseInt(list.get(10))));
                    venda.setValorProduto(Double.parseDouble(list.get(11)));

                    //Pagamento
                    venda.setTipoPagamento(Boolean.parseBoolean(list.get(12)));
                    venda.setDebOrCredPagamento(list.get(13));
                    venda.setBandeiraCartaoPagamento(list.get(14));
                    venda.setNumeroParcelasPagamento(Integer.parseInt(list.get(15)));


                    this.getListVendas().add(venda);
                    this.numeroDeRegistros++;
                }
            }
            
            return true;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        
    }

    /**
     * @return the listVendas
     */
    public List <Vendas> getListVendas() {
        return listVendas;
    }

    /**
     * @return the numeroDeRegistros
     */
    public int getNumeroDeRegistros() {
        return numeroDeRegistros;
    }

    /**
     * @return the fileExcel
     */
    public File getFileExcel() {
        return fileExcel;
    }
    
}
