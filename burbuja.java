public class burbuja {
    public static void main(String[] args) {
        //Equipo 1 - Metodo burbuja. Avelino Muñoz Antonio. (24500241) Jiménez Vargas Miguel. (24500267) Ortega Grajales Jesus Aziel. (24500281)
        int numeros[] = {8, 3, 12, 5, 9};
        
        for(int vuelta = 0; vuelta < numeros.length; vuelta++) {
            for(int i = 0; i < numeros.length - 1; i++) {
                if(numeros[i] > numeros[i+1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = aux;
                }
            }
        }
        System.out.println("Lista ordenada:");
        for(int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

