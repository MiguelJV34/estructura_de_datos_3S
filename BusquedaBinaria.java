import java.util.Scanner;
        //Equipo 1 - Busqueda Binaria, Jiménez Vargas Miguel. (24500267) Avelino Muñoz Antonio. (24500241) Ortega Grajales Jesus Aziel. (24500281)
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int tam = arreglo.length;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero que quieres buscar: ");
        int buscar = sc.nextInt();
        
        int izquierda = 0;
        int derecha = tam - 1;
        int medio;
        boolean encontrado = false;
        int posicion = -1;
        
        while (izquierda <= derecha) {
            medio = (izquierda + derecha) / 2;
            
            if (arreglo[medio] == buscar) {
                encontrado = true;
                posicion = medio;
                break;
            }
            else if (arreglo[medio] < buscar) {
                izquierda = medio + 1;
            }
            else {
                derecha = medio - 1;
            }
        }
        
        if (encontrado) {
            System.out.println("El numero " + buscar + " esta en la posicion " + posicion);
        } else {
            System.out.println("No se encontro el numero " + buscar + " en el arreglo");
        }
        
        sc.close();
    }
}