/**
 * Zadanie 2 - Indeks litery a
 * Dla podanego słowa znajdź indeks ostatniej litery 'a'. (char)
 * Użyj instrukcji skoku.
 */

public class IndexOfA {
    public static void main(String[] args) {

        char[] word = {'A','g','n','i','e','s','z','k','a'};
        //char[] word = {'K','r','z','y','s','z','t','o','f'};

        //wyświetlenie słowa
        System.out.print("Podane słowo: ");
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]);
        }
        System.out.println();

        //szukamy teraz indeksu ostatniej litery 'a'
        int index = - 1;    //Ujemny indeks - brak litery 'a' w słowie
        for (int i = 0; i < word.length; i++) {
            if (word[i] != 'a'){
                continue;
            }
            index = i;
        }

        //wyświetlimy teraz indeks ostatniej litery 'a'
        if (index == -1){
            System.out.println("Brak litery 'a' w podanym słowie");
        } else {
            System.out.println("Indeks ostatniej litery 'a' to: " + index);
        }
    }
}
