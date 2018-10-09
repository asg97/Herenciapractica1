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
public class Hechizo extends Carta{
    
    int alcance;

    public Hechizo(int alcance, String nombre, int ataque, int defensa, int elixir, int vida) {
        super(nombre, ataque, defensa, elixir, vida);
        this.alcance = alcance;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    public int ataqueHechizo(){
    return this.getAlcance()+this.getAtaque();
    }
    
    public int defensaHechizo(){
        
        return this.getAlcance()+this.getDefensa();
    
    }
}
