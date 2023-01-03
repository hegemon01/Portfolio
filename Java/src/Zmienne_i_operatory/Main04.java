// W pliku Main04.java w metodzie main stwórz trzy zmienne:

//        str1, typu String o wartości Java,
//        str2, typu String o wartości Course,
//        joinedStrings, typu String, przechowującą połączone napisy, rozdzielone spacją.
//        Wartości mają być nadawane w jednej linii, razem z deklaracją, czyli: type variableName = variableValue;
//        Do połączenia napisów użyj znaku konkatenacji (+) oraz dodatkowej spacji w postaci: " "
//        Wypisz wartość zmiennej joinedStrings na konsoli.
//        Oczekiwany wynik:

//        Java Course

package Zmienne_i_operatory;

public class Main04 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Course";
        String joinedStrings = str1 + " " + str2;
        System.out.println(joinedStrings);
    }
}
