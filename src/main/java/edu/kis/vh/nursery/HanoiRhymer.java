package edu.kis.vh.nursery;

/**
 * klasa HanoiRhymer dziedziczy z klasy DefaultCountingOutRhymer
 * atrybutem klasy jest zmienna totalRejected typu int
 * metoda reportRejected nie przyjmuje żadnych parametrów i zwraca wartośc int
 * nadpisana metoda countIn przyjmuje zmienną typu int i nic nie zwraca
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//przechodzenie pomiędzy otwartymi plikami (ctrl + alt + -> w Intellij)