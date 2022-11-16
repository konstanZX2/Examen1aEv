public class Main {
    public static void main(String[] args) {
Carta carta1 = new Carta("picas",10);
Carta carta2= new Carta("rombos",13);
        System.out.println(carta1);

        carta1.mostrarElArrayDeStrings();

        Mazo mazo1= new Mazo(1);
        mazo1.barajar();
        System.out.println(mazo1);

        Jugador jugador1 = new Jugador("s");
        jugador1.repartirCarta(carta1);
        jugador1.repartirCarta(carta2);
}}