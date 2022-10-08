//Curso Introducción a la programación
//Práctica Ejercicio_3 Openbootcamp
// Jose Luis Ahumada Navarro
// 2022
public class Main {
    public static void main(String[] args) {
        System.out.println("ITEM 1 SENTENCIA DE CONTROL IF");
        // Item 1
        int numeroIf = -5;

        if(numeroIf > 0){
            System.out.println("El número "+ numeroIf+" es positivo");
        }else if (numeroIf < 0){
            System.out.println("El número "+ numeroIf+" es negativo");
        }else if (numeroIf == 0){
            System.out.println("El número es 0");
        }


        System.out.println("ITEM 2 BUCLE WHILE");
        // Item 2
        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("ITEM 3 BUCLE DO WHILE");
        //Item 3

        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }while (numeroWhile < 3);


        System.out.println("ITEM 4 BUCLE FOR");

        // Item 4
        for (int numeroFor = 0;numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("ITEM 5 SENTENCIA DE CONTROL SWICTH");

        // Item 5
        var estacion = "otoño";

        switch (estacion){

            case "VERANO" ,"verano":
                System.out.println("La estación es VERANO");
                break;
            case "INVIERNO", "invierno":
                System.out.println("La estación es INVIERNO");
                break;
            case "OTOÑO", "otoño":
                System.out.println("La estación es OTOÑO");
                break;
            case "PRIMAVERA", "primavera":
                System.out.println("La estación es PRIMAVERA");
                break;
            default:
                System.out.println("El valor de la variable no corresponde a una estación");
        }
    }
}