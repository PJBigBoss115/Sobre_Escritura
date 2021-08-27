/*
 * Aqui realizaremos las pruebas del ejemplo
 */
package Sobre_Escritura;

/**
 *
 * @author pedro
 */

public class Principal {
     public  static  void  main ( String [] args ) {
         
         Cofre cofreX1 = new Cofre(15, 10, "default.png");
         
         cofreX1.Abrir();
         
         Cofre_Oro cofreX2 = new Cofre_Oro(15, 10, "CofreOro.png");
         
         cofreX2.Abrir();
         
         Cofre_Diamante cofreX3 = new Cofre_Diamante(15, 10, "CofreDiamante.png");
         
         cofreX3.Abrir();
        
    }
    
}
