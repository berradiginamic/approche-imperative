package fr.algorithmie;

public class SommeTableauxDiff {
    public static void main(String[] args) {
        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] sommeTableaux = new int[Math.max(tableau1.length,tableau2.length)];
        for (int i = 0; i < sommeTableaux.length; i++){
            int ValeurTableau1 = (i < tableau1.length) ? tableau1[i] : 0;
            int ValeurTableau2 = (i < tableau2.length) ? tableau2[i] : 0;
            sommeTableaux[i] = ValeurTableau1 + ValeurTableau2;
        }
        System.out.println("Tableau de somme est:");
        for (int value : sommeTableaux){
            System.out.println(value + "");}
        }
}
