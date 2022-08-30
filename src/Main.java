import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        int numero = -214;
        int number = 1;
        int number2 = 2;
        String estacion = "PAZ";

        System.out.println("-----------------------ejercicio 1 IF-----------------------");

        if(numero >= 1){
            System.out.println("el numero ingresado es positivo, el numero es: " + numero);
        }else if(numero == 0){
            System.out.println("El numero ingresado es Cero, el numero es: " + numero);
        }else{
            System.out.println("El numero ingresado es negativo, el numero es:" + numero);
        }
        System.out.println("-----------------------ejercicio 2 WHILE-----------------------");

        while(number < 3){
            System.out.println(number);
            number++;
        }
        System.out.println("-----------------------ejercicio 3 DO-WHILE-----------------------");

        do{
            System.out.println(number2);
            number2++;
        }while(number2 < 3);

        System.out.println("-----------------------ejercicio 4 FOR------------------------");

        for(int number3=0; number3 < 3; number3++){
            System.out.println(number3);
        }

        System.out.println("-----------------------ejercicio 4 SWITCH------------------------");

        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("Es VERANO");
                break;
            case "OTONO":
                System.out.println("Es OTONO");
                break;
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            default:
                System.out.println("Esta no es una estacion del anio");

        }

    }

    }
