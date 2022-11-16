import java.lang.reflect.Array;

public class Carta {
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
