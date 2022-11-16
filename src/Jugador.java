import java.lang.reflect.Array;
import java.util.Arrays;

public class Jugador {


    private String nombre;



    private Array cartas[] = new Array[19];

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Carta repartirCarta(Carta carta){
        for (int i = 0; i < cartas.length ; i++) {
            for (int j = 1; j <=13 ; j++) {
               new Carta(carta.PALOS[i],j );
            }


        }
     return carta;
    }

    @Override
    public String toString() {
        return  nombre + ": " + Arrays.toString(cartas) + ".";
    }

    public void getPuntuacion(){

    }
}
