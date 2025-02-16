/**
 * Zadanie 1 - Wyświetlenie elementów
 * Napisz program, który będzie wyświetlał co drugi element tablicy
 * z wykorzystanie instrukcji skoku
 */

public class DisplayElements {
    public static void main(String[] args) {

        /***********Przykład 1****************
         * Napisz program, który sprawdzi, czy wśród podanych
         * liczb jest liczba ujemna
         */

        int[] numbers = {1,4,-5,4};

        //instrukcja skoku break przerywa działanie pętli, natomiast
        //continue umożliwia pominięcie jednego obiegu pętli

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                System.out.println("Jest ujemna");
                break;
            }
        }   //ten program zakończy szukanie, gdy znajdzie pierwszą ujemną i przerywa pętlę

        //przykład użycia instrukcji skoku continue
        //***************Przykład 2**********************
        //Wyświetl 3 pierwsze i 3 ostatnie elementy tablicy
        int[] tabl = {5,-5,1,5,7,3,1,1,2};
        for (int i = 0; i < tabl.length; i++) {
            if (i > 2 && i < tabl.length - 3) {
                continue;
            }
            System.out.print(tabl[i] + ",");
        }
        System.out.println();

        //Zadanie 1 - Wyświetlenie elementów
        //Napisz program, który będzie wyświetlał co drugi element tablicy
        System.out.println("-----------continue----------");
        int[] tab = {2,34,2,342,34,23,42,1,23,6,34,234323};
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 1){
                continue;
            }
            System.out.println(tab[i]);
        }

        System.out.println("-----------if----------");
        for (int i = 0; i < tab.length; i++) { 
            if (i % 2 == 0){
                System.out.println(tab[i]);
            }
        }
    }
}
