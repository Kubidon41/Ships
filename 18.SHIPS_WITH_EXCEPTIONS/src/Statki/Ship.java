package Statki;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNumber);

    WarShip.Orientation getOrientation(); ///warship.orientation klasa wewnętrzna klasy warship
}

