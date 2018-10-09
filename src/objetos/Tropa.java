/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author serra
 */
public class Tropa extends Carta {
    
    int fuerza;

    public Tropa(int fuerza, String nombre, int ataque, int defensa, int elixir, int vida) {
        super(nombre, ataque, defensa, elixir, vida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    
    
    public int ataqueTropa(){
    
    return this.getAtaque()*this.getFuerza();
    
    }
}
