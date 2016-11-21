
package Ana;
public class Main {

    
    public static void main(String[] args) {
        
        //Cria, torna visível e exclui tela splash por 3000ms 
        Splash splash = new Splash();
        splash.setVisible(true);
        try {Thread.sleep(3000);}
        catch (Exception e) {}        
        splash.setVisible(false);
        //Inserir condicional para detectar se é primeira abertura do programa
        //Se sim criar e exibir uma tela de "PrimeiraAbertura", se não criar e exibir uma tela de Inicio
            
    }
    
}
