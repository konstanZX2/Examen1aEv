import java.lang.reflect.Array;

public class Mazo {


    private int numeroDeBarajas;

    public Mazo(int numeroDeBarajas) {
        this.numeroDeBarajas = numeroDeBarajas;
        Array almacenadorDeCartas[] = new Array[numeroDeBarajas*52];
        for (int k = 0; k < numeroDeBarajas * 52; k++) {
            for (int i = 0; i < almacenadorDeCartas.length; i++) {
                for (int j = 1; j <= 13; j++) {
                    System.out.println(new Carta(Carta.PALOS[i], j));

                }


            }
        }
    }
    @Override
    public String toString() {
        return "el numero de barajas es: "+numeroDeBarajas;

    }

    public void barajar(){

    }
}
