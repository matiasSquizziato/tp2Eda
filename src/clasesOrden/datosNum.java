package clasesOrden;


import java.util.Arrays;

public class datosNum {

    int[] numeros = new int[6];


    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }


    public void cargarList() {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
    }

    public void mostrarList() {
        for (int dato :numeros){
            System.out.println(dato + " ");
        }
        System.out.println(" ");
    }






}