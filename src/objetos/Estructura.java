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
public class Estructura extends Carta{
    
    int escudo;

    public Estructura(int escudo, String nombre, int ataque, int defensa, int elixir, int vida) {
        super(nombre, ataque, defensa, elixir, vida);
        this.escudo = escudo;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
  public int defensaTotal(){
  
  return this.getDefensa()*this.getEscudo();
  }  
}
