import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Suma objetoSuma = new Suma();
        int resultado = objetoSuma.realizarSuma(8, 9);
        System.out.println(resultado);

        /*Scanner scan = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = scan.nextLine();*/

        // System.out.println("Hola, " + nombre);

        /*Scanner scan2 = new Scanner(System.in);
        System.out.println("¿Cuál es el número?");
        int numero = Integer.parseInt(scan2.nextLine());
        if (numero > 0) {
            System.out.println("Es mayor a cero");
        } else {
            System.out.println("No es mayor a cero");
        }

        switch(numero) {
            case 1: // Este es el caso 1
                System.out.println("Eligió 1");
                break;
            case 2:
                System.out.println("Eligió 2");
                break;
            case 3:
                System.out.println("Eligió 3");
                break;
            default:
                System.out.println("Opción incorretca");
        }

        /* String saludo;
        saludo = "Hola mundo";
        char letra = 'a';
        System.out.println(saludo);
        System.out.println("letra: "  + letra);*/

        /*for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        int numero = 0;
        while (numero < 10) {
            System.out.println(numero);
            numero+=3;
        }*/

        /*int numero = 10;
        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);*/

        // Crear arreglos
        int valores[];
        valores = new int[3];

        // Asignar valores
        valores[0] = 56;
        valores[1] = 98;
        valores[2] = 46;

        // Recorres arreglo
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }


    }
}
