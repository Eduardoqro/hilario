package org.generation;
import java.util.Scanner; // se agrega este paquete para Scanner
//se corrigio el nombre de la clase 
public class Codigo4 { // inicia la clase
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine();
    
    if (j1 == j2) { // se elimina el ) de mas
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }// se agrega } 
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
}

}
}//finaliza la clase 
/* Imprime en terminal:
Turno del jugador 1 (introduzca piedra, papel o tijeras): piedra
Turno del jugador 2 (introduzca piedra, papel o tijeras): papel
Gana el jugador 1
*/


