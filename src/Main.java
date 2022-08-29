import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        suma(5, 3 ,12);
        Coche miCoche = new Coche();
        miCoche.AddPuerta();
        System.out.println("mi Coche ahora tiene " +miCoche.puertas +" puerta");
    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche{
    public int puertas = 0;

    public void AddPuerta(){
        this.puertas++;
    }
}