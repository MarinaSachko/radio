package ru.netology.statistic;

import java.util.Objects;

public class Radio {

    private int currentNumberStation;

    private int currentVolume;

    private int quantityRadiostation = 10;

    public Radio(int quantityRadiostation) {

        this.quantityRadiostation = quantityRadiostation;
    }

    public Radio() {
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > -1) {
            if (currentNumberStation < quantityRadiostation) {
                this.currentNumberStation = currentNumberStation;
            }
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        if (currentVolume > 100) {
            this.currentVolume = 100;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentNumberStation == quantityRadiostation-1) {
            currentNumberStation = 0;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }
    }

    public void prevStation() {
        if (currentNumberStation == 0) {
            currentNumberStation = quantityRadiostation-1;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }
    }
}
