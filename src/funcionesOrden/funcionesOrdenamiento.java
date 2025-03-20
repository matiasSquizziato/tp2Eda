package funcionesOrden;

import java.sql.SQLOutput;

public class funcionesOrdenamiento {

    //array no list

    public void bubbleSort(int listaNum[], int tamano){

        int i, j, temp;
        boolean bandera;

        //controla cuantas veces se recorre el arreglo()
        for (i = (tamano -1); i >= 0 ; i--) {
           bandera = false;
            for (j = 1; j <= i; j++){

                //compara elemensots adyacentes
                if (listaNum[j -1] > listaNum[j]){
                    //intercambio de elemtos
                    temp = listaNum[j -1];
                    listaNum[j - 1] = listaNum[j];
                    listaNum[j] = temp;
                    bandera = true;
                }
            }
            if (!bandera){
                break;
            }
        }
    }

    //InsertionSort(arreglo):
    //    para i desde 1 hasta longitud(arreglo) - 1:
    //        clave = arreglo[i]
    //        j = i - 1
    //        mientras j >= 0 y arreglo[j] > clave:
    //            arreglo[j + 1] = arreglo[j]
    //            j = j - 1
    //        arreglo[j + 1] = clave


    public void insertionSort(int[] listaNum, int tamano) {
        int i, j, aux;

        for (i = 1; i < tamano; i++) {
            aux = listaNum[i];
            //pos anterior a i
            j = i - 1;

            while (j >= 0 && listaNum[j] > aux) {
                listaNum[j + 1] = listaNum[j];
                j = j - 1;
            }


            listaNum[j + 1] = aux;
        }
    }

    //ShellSort(arreglo):
    //    n = longitud(arreglo)
    //    gap = n / 2
    //    mientras gap > 0:
    //        para i desde gap hasta n - 1:
    //            temp = arreglo[i]
    //            j = i
    //            mientras j >= gap y arreglo[j - gap] > temp:
    //                arreglo[j] = arreglo[j - gap]
    //                j = j - gap
    //            arreglo[j] = temp
    //        gap = gap / 2

    public void shellSort(int[] listaNum, int tamano) {

        //seteo el gap
        int gap = tamano / 2;
        int i, j, aux;

        while (gap > 0) { // Mientras que el gap sea mayor que 0
            for (i = gap; i < tamano; i++) { //recorro desde el gap hasta el final del arreglo
                aux = listaNum[i]; // guardo el elemento actual
                j = i;

                System.out.println("----------------------------");
                System.out.println("Elemento actual: " + aux + " en posición " + i);
                System.out.println("Comparando con elementos en posiciones anteriores con gap " + gap);

                while (j >= gap && listaNum[j - gap] > aux) {

                    System.out.println("  - Comparando " + aux + " con " + listaNum[j - gap] + " en posición " + (j - gap));
                    System.out.println("  - " + listaNum[j - gap] + " es mayor que " + aux + ", desplazando " + listaNum[j - gap] + " a la posición " + j);

                    listaNum[j] = listaNum[j - gap]; // Desplaza el elemento hacia adelante
                    j = j - gap; // Avanza hacia atrás en el subgrupo
                }

                listaNum[j] = aux; //posiciono el aux en el lugar
                System.out.println("  - Colocando " + aux + " en la posición " + j);
                System.out.println("Arreglo actual");
            }

            gap = gap / 2; // recorto el gap
        }
    }


}
