package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(0, 0, 10, 0, 100, 0);

    @Test
        //следующая станция;
    void nextStationButton() {
        radio.nextStationButton();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
        //следующая станция выше максимума;
    void nextStationButtonOverTheUpperBound() {
        radio.setCurrentStation(10);
        radio.nextStationButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //предыдущая станция;
    void prevStationButton() {
        radio.setCurrentStation(5);
        radio.prevStationButton();
        assertEquals(4, radio.getCurrentStation());
    }


    @Test
        //предыдущая станция ниже минимума;
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
        radio.setCurrentVolume(100);
        radio.volumePlusButton();
        assertEquals(100, radio.getCurrentVolume());
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

    @Test
        //выставить номер радиостанции с цифрового пульта в допустимых пределах;
    void setCurrentStation() {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
        //выставить номер радиостанции с цифрового пульта выше допустимых пределов;
    void setCurrentStationOverBound() {
        radio.setCurrentStation(12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //выставить номер радиостанции с цифрового пульта выше допустимых пределов;
    void setCurrentStationBelowBound() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}
