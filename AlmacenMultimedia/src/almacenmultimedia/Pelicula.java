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
public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;
    
    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz){
        super(titulo, autor, formato, duracion);
        
        if(actor==null && actriz == null){
            throw new IllegalArgumentException("Actor y Actriz no pueden ser nulas juntes");
        }
        
        if(actor!=null){
            this.actor = actor;
        }
        if(actriz != null){
            this.actriz = actriz;
        }
    }
}
