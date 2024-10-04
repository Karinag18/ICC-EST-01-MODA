import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento metOr = new MetodoOrdenamiento();
        /*int[] arr = {5,8,9,3,0};
        int[] arrt = {1, 2, 3, 4, 5};
        metOr.sortBubblrAva(arr);
        metOr.printArreglo(arr);

        metOr.sortBubblrAva(arrt);
        metOr.printArreglo(arrt);*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo ");

        int tamanio = 0;
        /*int tamanio = leer.nextInt();

        if(tamanio <= 0){
            System.out.println("Ingreso invalido, adios");
            return;
        }*/

        do { 
            System.out.println("Ingrese el tamaño que sea entero o positivo: ");
            while(!leer.hasNextInt()){

                System.out.println("Te pedi un Entero Valido");
                leer.next();
            }
            tamanio = leer.nextInt();
            if(tamanio <= 0){
                System.out.println("El tamanio del numero debe ser positivo");
            }
        } while (tamanio <= 0);
        
        int[] arreglo = new int[tamanio];

        System.out.println("Ingrese los numeros del arreglo");

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese numero en la posición " + (i + 1) + ":");
            while(!leer.hasNextInt()) {
                System.out.println("Te pedí un entero válido");
                leer.next();
            }
            arreglo[i] = leer.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        leer.close();

        metOr.sortBubblrAva(arreglo);
        metOr.printArreglo(arreglo);

    }
    
    //Metodo para validar si la entrada es un numero entero
    public static int leerenteroValido(Scanner leer,String mensaje,
     boolean permitirNegativos){
        int numero; 
        do { 
            System.out.println(mensaje);
            while(!leer.hasNextInt()){

                System.out.println("Te pedi un Entero Valido");
                System.out.println(mensaje);
                leer.next();
            }
            numero = leer.nextInt();
            if(!permitirNegativos && numero < 0){
                System.out.println("El numero debe ser positivo no se permiten negativos");
            }
        } while (!permitirNegativos && numero < 0);
        
        return numero;
    }
}
