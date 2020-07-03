package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

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
