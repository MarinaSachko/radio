package ru.netology.statistic;

public class Radio {

    private int currentNumberStation;

    private int currentVolume;

    private int quantityRadiostation = 10;

    public Radio (int quantityRadiostation){

        this.quantityRadiostation = quantityRadiostation;
    }
    public Radio (){
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

    public void setCurrentNumberStation(int numberStation) {
        if (numberStation > -1) {
            if (numberStation < quantityRadiostation) {
                currentNumberStation = numberStation;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentNumberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }


}
