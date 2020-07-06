
package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);

    @Test
        //выставить номер радиостанции в допустимых пределах;
    void setCurrentStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
        //выставить номер радиостанции выше допустимого предела;
    void setCurrentStationOverTheUpperBound() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //выставить номер радиостанции ниже допустимого предела;
    void setCurrentStationBelowTheLowerBound() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //следующая станция в пределах от 0 до 9;
    void nextStationButton() {
        radio.nextStationButton();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
        //следующая станция выше 9;
    void nextStationButtonOverTheUpperBound() {
        radio.setCurrentStation(10);
        radio.nextStationButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //предыдущая станция в пределах от 0 до 9;
    void prevStationButton() {
        radio.setCurrentStation(5);
        radio.prevStationButton();
        assertEquals(4, radio.getCurrentStation());
    }


    @Test
        //предыдущая станция ниже 0;
    void prevStationButtonBelowTheLowerBound() {
        radio.prevStationButton();
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
        //увеличить громкость на 1 в допустимых пределах;
    void volumePlusButton() {
        radio.volumePlusButton();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
        //увеличить громкость на 1 выше верхней границы;
    void volumePlusButtonOverTheUpperBound() {
        radio.setCurrentVolume(10);
        radio.volumePlusButton();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
        //уменьшить громкость на 1 в допустимых пределах;
    void volumeMinusButton() {
        radio.setCurrentVolume(5);
        radio.volumeMinusButton();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
        //уменьшить громкость на 1 ниже нижней границы;
    void volumeMinusButtonBelowLowerBound() {
        radio.volumeMinusButton();
        assertEquals(0, radio.getCurrentVolume());
    }
}