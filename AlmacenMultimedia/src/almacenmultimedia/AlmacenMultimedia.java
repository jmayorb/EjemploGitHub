/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenmultimedia;

/**
 *
 * @author Jaime Mayor Baeza
 */
public class AlmacenMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multimedia m1 = new Multimedia("Hotel California", "The Eagles", Formato.MP3, 390);
        Multimedia m2 = new Multimedia("One", "Metallica", Formato.AVI, 444);
        
        System.out.println(m1);
        
        System.out.println(m2);
        
        if( m1.equals(m2) ){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
        
        try
        {
            Pelicula p1 = new Pelicula("Star Wars", "George Lucas", Formato.AVI, 1234, null, null);
        }
        catch(IllegalArgumentException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
        catch(Exception ex){
            
        }
    }
    
}

