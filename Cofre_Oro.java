/*
 * Creamos la primera clase hija Cofre de oro
 * la cual al abir tomara una accion diferente..
 */
package Sobre_Escritura;

/**
 * Recordar colocar "extends" para que herede los
 * atributos y metodos de cofre "Clase padre"
 * @author pedro
 */

public class Cofre_Oro extends Cofre {

    /**
     * Creamos nuestro constructor con "super"..
     * @param dimesnsionX
     * @param dimensionY
     * @param textura 
     */
    
    public Cofre_Oro(int dimesnsionX, int dimensionY, String textura) {
        
        super(dimesnsionX, dimensionY, textura);
        
    }
    
    /**
     * Al sobre escribir el metodo y agregar la 
     * anotacion Overtide, se da a entender que esta clase
     * sobre escribira el metodo heredado por lo cual este ya no
     * saldria y el ejecutado seria de esta clase
     */
    
    @Override
    
    public void Abrir(){
        
        System.out.println("El cofre se ha abierto, toma un poco de oro");
        
    }
    
}
