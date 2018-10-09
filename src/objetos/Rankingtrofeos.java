/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import java.util.Comparator;
/**
 *
 * @author serra
 */
public class Rankingtrofeos implements Comparator<Jugador> {
    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        if (jugador1.getNumTrofeos()> jugador2.getNumTrofeos()) {
            return 1;
        } else if (jugador1.getNumTrofeos() < jugador2.getNumTrofeos()) {
            return -1;
        } else {
            return 0;
        }

    }
}
