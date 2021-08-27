/*
 * Creamos la segunda clase hija Cofre de diamante
 * la cual al abir tomara una accion diferente..
 */
package Sobre_Escritura;

/**
 *
 * @author pedro
 */
public class Cofre_Diamante extends Cofre {

    public Cofre_Diamante(int dimesnsionX, int dimensionY, String textura) {
        
        super(dimesnsionX, dimensionY, textura);
        
    }
    
    /**
     * Repetimos el proceso
     */
    
    @Override
    
    public void Abrir(){
        
        System.out.println("El cofre se ha abierto, toma un poco de diamante");
        
    }
    
}
