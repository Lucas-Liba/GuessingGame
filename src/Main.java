
import java.util.*;
//TODO

public class Main {

    public static void main (String[] args){
        Random dice = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = dice.nextInt(1,100),intentos=0;
        boolean win = false;
        System.out.println(randomNumber);
        while(!win){
            System.out.println("Ingresa tu predicción");
            int prediccion = sc.nextInt();
            if(prediccion==randomNumber){
                System.out.printf("Ganaste luego de %d intentos",++intentos);
                win = true;
            } else if (prediccion>randomNumber) {
                System.out.println("Mas bajo");
                intentos++;
            } else if (prediccion<randomNumber) {
                System.out.println("Mas alto");
                intentos++;
            }
        }
    }
}