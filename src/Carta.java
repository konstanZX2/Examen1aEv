import java.lang.reflect.Array;

public class Carta {
    public String getPalo() {
        return palo;
    }

    public int getPuntuacion(){
        if (numero==1){
            return 11;
        }
        if (numero <=10){
            return numero;
        }else {
            return 10;
        }
    }

    private String palo;


    private int numero;
    //♠, ♥, ♦, ♣
    public static final String[] PALOS = new String[]{
            "rombos","picas","corazones","treboles"
    };



    public Carta(String palo, int numero) {
        if (palo.matches("picas") || palo.matches("corazones") || palo.matches("rombos")
                || palo.matches("treboles")) {
            this.palo = palo;
        } else {
            System.out.println("picas/corazones/treboles/rombos");

        }
        if (numero > 0 && numero < 14) {
            this.numero = numero;
        } else {
            System.out.println("del 1 al 13");
        }
    }

    @Override
    public String toString() {

        //String s= "";
        /*if(numero) <=10){
        s+=numero;}
        else{
        switch(numero){
        case 11: s+="J";
        break;
        case 12: s+="Q";
        break;
        case 13: s+="K";
        break;

        s+= " de "+ palo;
        return s;
        }
        }






         */
        return "Tu carta es el " + numero + " de " + palo + ".";

    }


//    public void mostrarElArrayDeStrings(){
//        String rombos = "rombos";
//        String treboles = "treboles";
//        String picas = "picas";
//        String corazones= "corazones";
//        for (int i = 0; i <1 ; i++) {
//            PALOS[i]=rombos;
//            i++;
//            PALOS[i]=treboles;
//            i++;
//            PALOS[i]=picas;
//            i++;
//            PALOS[i]=corazones;
//
//        }
public void mostrarElArrayDeStrings(){
        for (int i = 0; i <PALOS.length ; i++) {
            System.out.println(PALOS[i]);


        }

    }

}
