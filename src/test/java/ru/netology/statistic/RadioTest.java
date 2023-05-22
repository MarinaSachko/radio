package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldIncreaseVolumeNegativ() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-5);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePozitiv() {

        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreBorder() {

        Radio rad = new Radio();

        rad.setCurrentVolume(102);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithinBorders() {

        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeNegative() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumePozitiv() {

        Radio rad = new Radio();

        rad.setCurrentVolume(7);
        rad.decreaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNegativ() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(-1);
        radioStation.nextStation();

        int expected = 1;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNine() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(9);
        radioStation.nextStation();

        int expected = 0;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationPozitiv() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(5);
        radioStation.nextStation();

        int expected = 6;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMoreNullMoreNine() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(15);
        radioStation.nextStation();

        int expected = 1;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNegative() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(-1);
        
        radioStation.prevStation();

        int expected = 9;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNull() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(0);
        radioStation.prevStation();

        int expected = 9;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationWithingBorder() {

        Radio radioStation = new Radio();

        radioStation.setCurrentNumberStation(2);
        radioStation.prevStation();

        int expected = 1;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
