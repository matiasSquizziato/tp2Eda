import clasesOrden.datosNum;
import funcionesOrden.funcionesOrdenamiento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //grupo 16
        //Ximena Analia Cuello
        //Luciano Jesús Rodriguez
        //Matias Squizziato

        datosNum datos = new datosNum();
        int tamano = datos.getNumeros().length;

        //pasar la lista original a una copia para cada una de las funciones a ordenar

        datos.cargarList();
        System.out.println("Arreglo con 1000 numeros aleatorios");
        datos.mostrarList();
        System.out.println(" ");

        //-----------------------------------------------------------------------------

        //llamo la funcion bubbleSort
//        funcionesOrdenamiento bbSort = new funcionesOrdenamiento();
//       // bbSort.bubbleSort(datos.getNumeros(), tamano);
//        System.out.println(" ");
//        System.out.println("Arreglo ordenado con 'Bubble Sort'");
//        datos.mostrarList();


        //-----------------------------------------------------------------------------


        //llamo al insertion-sort
        funcionesOrdenamiento insertSort = new funcionesOrdenamiento();
        //insertSort.insertionSort(datos.getNumeros(),tamano);
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println("Arreglo ordenado con insertion Sort");
//        datos.mostrarList();


        //-----------------------------------------------------------------------------


        //llamo al shellSort
        funcionesOrdenamiento shellSort = new funcionesOrdenamiento();
        shellSort.shellSort(datos.getNumeros(), tamano);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Arreglo ordenado con 'ShellSort'");
        datos.mostrarList();

        //System.currentTimeMillis(); System.nanoTime();


    }
    }
