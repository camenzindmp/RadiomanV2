
package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //выставить номер радиостанции:
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    //кнопка next:
    public void nextStationButton() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    //кнопка prev:
    public void prevStationButton() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    //увеличить громкость на 1:
    public void volumePlusButton() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    //уменьшить громкость на 1:
    public void volumeMinusButton() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }
}