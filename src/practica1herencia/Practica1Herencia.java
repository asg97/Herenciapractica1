/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1herencia;

import Excepciones.Excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import objetos.Carta;
import objetos.Estructura;
import objetos.Hechizo;
import objetos.Jugador;
import objetos.Rankingtrofeos;
import objetos.Tropa;

/**
 *
 * @author serra
 */
public class Practica1Herencia {

    /**
     * @param args the command line arguments
     * @throws Excepciones.Excepciones
     */
    private static ArrayList<Jugador> usuarios = new ArrayList<>();
    private static ArrayList<Carta> cartas = new ArrayList<>();

    public static void main(String[] args) throws Excepciones {

        Tropa t1 = new Tropa(2, "soldado", 4, 3, 3, 50);
        Tropa t2 = new Tropa(1, "sapo", 2, 2, 1, 25);
        Tropa t3 = new Tropa(5, "troll", 5, 5, 5, 100);
        Estructura e1 = new Estructura(3, "torre", 3, 4, 4, 95);
        Estructura e2 = new Estructura(2, "balista", 2, 2, 2, 55);
        Estructura e3 = new Estructura(4, "asedio", 2, 5, 3, 70);
        Hechizo h1 = new Hechizo(7, "troncazo", 2, 1, 2, 50);
        Hechizo h2 = new Hechizo(6, "fuego", 3, 3, 3, 30);
        Hechizo h3 = new Hechizo(5, "relampago", 3, 3, 5, 60);

        Jugador j1 = new Jugador("jaime", "pass1", 5, new ArrayList());
        Jugador j2 = new Jugador("jose", "pass2", 0, new ArrayList());
        Jugador j3 = new Jugador("antonio", "pass3", 3, new ArrayList());
        Jugador j4 = new Jugador("felipe", "pass4", 0, new ArrayList());

        usuarios.add(j1);
        usuarios.add(j2);
        usuarios.add(j3);
        usuarios.add(j4);

        cartas.add(t1);
        cartas.add(t2);
        cartas.add(t3);
        cartas.add(e1);
        cartas.add(e2);
        cartas.add(e3);
        cartas.add(h1);
        cartas.add(h2);
        cartas.add(h3);
        Scanner entrada = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = "";
        do {
            try {
                System.out.println("Menu");
                System.out.println("C:Conseguir cartas");
                System.out.println("B:Batallas");
                System.out.println("R:Ranking");
                System.out.println("S:Salir");

                data = br.readLine();
                String[] datos = data.split(" ");
                switch (datos[0].toUpperCase()) {

                    case "C":
                        System.out.println("Conseguir cartas");
                        ConseguirCartas(datos);
                        break;
                    case "B":
                        System.out.println("Batallas");
                        Batalla(datos);
                        break;

                    case "R":
                        System.out.println("Ranking");
                        Ranking(datos);
                        break;
                    case "S":
                        System.out.println("Salir");
                        Salir(datos);
                        break;
                    default:
                        throw new Exception("ERROR 004: Operación incorrecta");
                }
            } catch (IOException ex) {
                System.out.println("Error: Entrada y salida");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (!data.equalsIgnoreCase("S"));
    }

    public static void ConseguirCartas(String[] datos) throws Excepciones {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el  username");
        String usuname = entrada.next();
        System.out.println("Introduce el password");
        String password = entrada.next();

        for (Jugador j : usuarios) {

            if (usuname.equals(j.getNombre())) {
                if (password.equals(j.getPassword())) {

                    System.out.println("logueado correctamente");
                    
                    
                    
                    
                    

                } else {

                    System.out.println("incorrecto");
                    break;
                }

            } else {
                System.out.println("incorrecto");
                break;

            }

        }

//        try {
//            boolean existe1 = false;
//            boolean existe2 = false;
//
//            for (Jugador j : usuarios) {
//
//                existe1 = j.getNombre().equalsIgnoreCase(datos[1]) && true;
//                existe2 = j.getPassword().equalsIgnoreCase(datos[2]) && true;
//
//            }
//            if (existe1 == false && existe2 == false) {
//                
//                System.out.println("no existe tal usuario");
//
//            }
//
//        }  catch (Exception e) {
//
//            System.out.println(e.getMessage());
//        }
    }

    public static void Batalla(String[] datos) {
    }

    public static void Ranking(String[] datos) throws Excepciones {

        if (datos.length != 1) {
            throw new Excepciones("ERROR 001: Nº de argumentos inválido");
        } else {
            int contador = 0;
            Collections.sort(usuarios, new Rankingtrofeos().reversed());
            for (Jugador j : usuarios) {
                if (contador < 4) {
                    System.out.println(j);
                }
                contador++;
            }
            if (ArrayList <Jugador> usuarios[3] == 0) {
                throw new Excepciones("CLASIFICACION: Usuarios sin trofeos");
            }
        }
    }

    public static void Salir(String[] datos) throws Excepciones {

        if (datos.length > 1) {
            throw new Excepciones("ERROR 001: Nº de argumentos inválido");
        }
    }

}
