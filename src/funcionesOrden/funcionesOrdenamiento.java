package funcionesOrden;

import java.util.Arrays;

public class funcionesOrdenamiento {

    //BubbleSort
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

    //insertionSort
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

    //ShellSort:
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
                System.out.println("Arreglo actual" + Arrays.toString(listaNum));
            }

            gap = gap / 2; // recorto el gap
        }
    }


    //Metodo mergeSort
    public void mergeSort (int[] listNum, int tamano){

    }

    //Busqueda binaria
    public void busquedaBinaria(int[] listNum, int elementoBus){

        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] == elementoBus){
                System.out.println("Elemento encontrado en la pos: [" + i + "]");;  //retorno el elemento que coincide
            } else {
                System.out.println("En la pos: [" + i + "]" + " no se encuentra");
            }
        }


    }


}
