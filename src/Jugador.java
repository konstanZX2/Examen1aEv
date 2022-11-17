import java.lang.reflect.Array;
import java.util.Arrays;

public class Jugador {
/*
public static final int NUM_CARTAS=20;

private String nombre;
private Carta[] mano;
private int numCartas=0;

public Jugador(String nombre){
this.nombre=nombre;
mano=new Carta[NUM_CARTAS];
for(int i=0; i<mano.length; i++){
mano[i]=null;
}
}

public void repartirCarta(Carta carta){
mano[numCartas] = carta;
numCartas++;

}

@Override
public String toString(){
String s= numbre +": ";
boolean primero=true;
for(int i=0; i<numCartas; i++){
if(primero){
primero=false;}
else{
s+=", ";
}

s+= mano[i];
}


public int getPuntuacion(){
int puntuacion=0;
int contadorAses=0;
for(int i=0; i<numCartas;i++){

int puntos= +=mano[i].getPuntuacion();
if(puntos ==11 && puntuacion+puntos >21){
puntos=1;}

puntuacion+=puntos;



}
}
}











 */

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
