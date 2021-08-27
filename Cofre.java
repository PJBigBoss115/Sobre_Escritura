/*
 * Clase padre que hererada sus metodos y atributos.
 */
package Sobre_Escritura;

/**
 *
 * @author pedro
 */

public class Cofre {
    
    private int dimesnsionX;
    private int dimensionY;
    private String textura;

    /**
     * Creamos nuestro constructor con los parametros
     * @param dimesnsionX
     * @param dimensionY
     * @param textura 
     */
    
    public Cofre(int dimesnsionX, int dimensionY, String textura) {
        
        this.dimesnsionX = dimesnsionX;
        this.dimensionY = dimensionY;
        this.textura = textura;
        
    } 
    
    /**
     * Y creamos nuestro metodo a heredar y modificar..
     */
    
    public void Abrir(){
        
        System.out.println("El cofre se ha abierto pero no tiene nada adentro");
        
    }
    
}
