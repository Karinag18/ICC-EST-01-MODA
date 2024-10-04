public class MetodoOrdenamiento {
    public int[] sortBubblrAva(int[] arreglo){
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++){
            System.out.println(" Pasada " + i);
            for (int j = 0; j < n - 1 - i; j++){
                System.out.println("j = " +j + " [j] = " + arreglo[j] + "j + 1 = " 
                + j + 1 + " [j + 1] " + arreglo[j + 1]);
                if (arreglo[j] < arreglo[j + 1]){
                    System.out.println("Si hay cambio");
                //INTERCAMBIO
                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
                intercambio = true;
                }
            }
            // si no hubo ningubn intercambio es por ya esta ordenado
            // y no deberia preguntar mas
            if ( intercambio){
                break;
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arr) {
        for (int num : arr){
            System.out.println(num);
        }
    }
}
