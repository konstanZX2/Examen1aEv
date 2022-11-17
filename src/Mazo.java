import java.lang.reflect.Array;

public class Mazo {

/*private Carta[] cartas;
public static final NUM_CARTAS_EN_BARAJA= 52
private int numCartasQuedan;

public Mazo(int numBarajas){
numCartasQuedan = numBarajas * NUM_CARTAS_EN_BARAJA;
cartas = new Carta[numCartasQuedan];
int i=0;
for (int numBaraja =1; numBaraja <= numBarajas; numBaraja++;){
for(int palo = 0; palo < Carta.PALOS.length; palo++;){
for(int numero = 1; numero<= 13; numero ++;){
cartas[i]= new Carta(numero, Carta.PALOS[palo]);
i++;
}
}
}
}


 */
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
        for(int i =0; i<10000; i++){
            int r1= (int)(Math.random()*cartas.length);
            int r2= (int)(Math.random()*cartas-length);
            Carta temp = cartas[r1];
            cartas[r1]=cartas[r2];
            cartas[r2]=temp;
        }


    }

    public Carta extraerCarta(){
        numCartasQuedan--;
        return cartas[numCartasQuedan];
    }

    @Override
    public String toString(){
        boolean first;
        String s="";
        for (int palo = 0; palo < Carta.PALOS.length; palo++) {
            first=true;
            for (int i = 0; i <numCartasQuedan ; i++) {
                if(cartas[i].getPalo().equals(Carta.PALOS[palo])){
                    if(first){
                        first=false;
                    }else{
                        s+= ", ";
                    }
                    s+= cartas[i];

                }

            }
            s+="\n";

        }
        return s;
    }
}
