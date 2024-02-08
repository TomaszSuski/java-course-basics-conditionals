public class Main {

    public static void main(String[] args) {
        /*
        Zadanie

Stwórz program, który sprawdzi, czy osoba w wieku 'wiek' może się uczyć, pracować, czy też może przejść na emeryturę.

Oczekiwane wejście:

Liczba całkowita reprezentująca wiek osoby. Utwórz zmienną o nazwie 'wiek' i ustaw ją na np. 25

Oczekiwany wynik w konsoli:

Napis, "Musisz się uczyć.", jeśli wiek jest mniejszy niż 15

Napis, "Możesz pracować.", jeśli wiek jest większy lub równy 18 i mniejszy niż 65

Napis, "Możesz iść na emeryturę.", jeśli wiek jest większy lub równy 65

Wskazówki:

Upewnij się, że używasz odpowiednich operatorów porównania (mniej niż <, więcej niż >, mniej niż lub równy <=, więcej niż lub równy >=)

Pamiętaj o użyciu operatora logicznego &&, aby sprawdzić, czy wiek jest większy lub równy 18 i mniejszy niż 65

Przetestuj swój kod z różnymi wartościami wejścia, aby upewnić się, że działa zgodnie z oczekiwaniami.

Jeszcze dokładniejsze wskazówki:

Użyj instrukcji warunkowej else if, aby sprawdzić, czy wiek jest mniejszy niż 15. Jeśli warunek jest spełniony, wyświetl "Musisz się uczyć."

Użyj instrukcji else if, aby sprawdzić, czy wiek jest większy lub równy 18 i mniejszy niż 65. Jeśli warunek jest spełniony, wyświetl "Możesz pracować."

Użyj instrukcji else if, aby sprawdzić, czy wiek jest większy lub równy 65. Jeśli warunek jest spełniony, wyświetl "Możesz iść na emeryturę."
         */

        /* if / else if / else w java
            int age = 65;

            if (age < 15) System.out.println("Musisz się uczyć.");
            else if (age >= 18 && age < 65) System.out.println("Możesz pracować.");
            else if (age >= 65) System.out.println("Możesz iść na emeryturę.");
            else System.out.println("Ciesz się życiem młody!");
         */

//        ===========================================================================================

        /* switch w java
           nie da się porównywac w switchu double ani String!, można int lub char

            int a = 110;

            switch(a)
            {
                case 50:
                    System.out.println("a jest równe 50");
                    break;
                case 100:
                    System.out.println("a jest równe 100");
                    break;
                default:
                    System.out.println("a nie jest równe 50 ani 100. Jest równe " + a);
        }
         */

//        ===========================================================================================

        /* wyrażenia warunkowe (jak w JS)

            int x = 5;

                if (x % 2 == 0) System.out.println("parzysta");
                else System.out.println("nieparzysta");

            w jednej linii:

            String isEven = x % 2 == 0 ? "parzysta" : "nieparzysta";

            System.out.println(isEven);

        */

    }
}
