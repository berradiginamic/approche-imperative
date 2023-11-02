package fr.algorithmie;

public class InverseContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayCopy[i] = array[array.length -1-i];
        }
        System.out.println("array:");
        for (int value : array){
            System.out.println(value + "");
        }
        System.out.println("a arrayCoppy:");
        for (int value : arrayCopy){
            System.out.println(value + "");
        }
    }
}
