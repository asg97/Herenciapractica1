/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author serra
 */
public class Jugador {

    String nombre;
    String password;
    int numTrofeos;
    ArrayList<Carta> mazo;

    public Jugador(String nombre, String password, int numTrofeos, ArrayList<Carta> mazo) {
        this.nombre = nombre;
        this.password = password;
        this.numTrofeos = numTrofeos;
        this.mazo = mazo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumTrofeos() {
        return numTrofeos;
    }

    public void setNumTrofeos(int numTrofeos) {
        this.numTrofeos = numTrofeos;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", password=" + password + ", numTrofeos=" + numTrofeos + ", mazo=" + mazo + '}';
    }

}
