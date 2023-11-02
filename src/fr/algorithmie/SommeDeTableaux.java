package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        if (tableau1.length != tableau2.length) {
            System.out.println("les tableaux n'ont pas la mème longueur donc on ne peut pas faire la somme");
            return;
        }
        int[] sommeTableaux = new int[tableau1.length];
        for (int i = 0; i < tableau1.length; i++){
            sommeTableaux[i] = tableau1[i] + tableau2[i];
        }
        System.out.println("la somme est:");
        for (int value : sommeTableaux){
            System.out.println(value + "");
        }
        }
}
