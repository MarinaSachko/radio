package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {


    @Test
    public void shouldIncreaseVolumeNegativ() {

        Radio rad = new Radio(8);

        rad.setCurrentVolume(-5);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePozitiv() {

        Radio rad = new Radio(7);

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreBorder() {

        Radio rad = new Radio(5);

        rad.setCurrentVolume(102);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithinBorders() {

        Radio rad = new Radio(9);

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeNegative() {

        Radio rad = new Radio(10);

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumePozitiv() {

        Radio rad = new Radio(3);

        rad.setCurrentVolume(7);
        rad.decreaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNegativ() {

        Radio radioStation = new Radio(4);

        radioStation.setCurrentNumberStation(-1);
        radioStation.nextStation();

        int expected = 1;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {

        Radio radioStation = new Radio(5);

        radioStation.setCurrentNumberStation(4);
        radioStation.nextStation();

        int expected = 0;
        int actual = radioStation.getCurrentNumberStation() ;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationPozitiv() {

        Radio radioStation = new Radio(6);

        radioStation.setCurrentNumberStation(3);
        radioStation.nextStation();

        int expected = 4;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMoreNullMoreNine() {

        Radio radioStation = new Radio(7);

        radioStation.setCurrentNumberStation(15);
        radioStation.nextStation();

        int expected = 1;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNegative() {

        Radio radioStation = new Radio(8);

        radioStation.setCurrentNumberStation(-1);
        
        radioStation.prevStation();

        int expected = 7;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNull() {

        Radio radioStation = new Radio(9);

        radioStation.setCurrentNumberStation(0);
        radioStation.prevStation();

        int expected = 8;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationWithingBorder() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(2);
        radioStation.prevStation();

        int expected = 1;
        int actual = radioStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
}
