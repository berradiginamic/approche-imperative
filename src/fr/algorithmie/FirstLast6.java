package fr.algorithmie;
public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 5, -8, 6};
        boolean ValeurBooleenne = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);
        System.out.println("la valeur booléenne est:" + ValeurBooleenne);
    }
}