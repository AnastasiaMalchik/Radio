package ru.netology.radio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio;
    private Radio radioCustom;
    private int maxStation = 500;
    private int currentStation = 222;

    @BeforeEach
    void setUp() {
        radio = new Radio();
        radioCustom = new Radio(maxStation);
    }

    @Test
    void next1() {
        radio.next();
        assertEquals(1,radio.getStation());
    }

    @Test
    void nextDefault() {

        for (int i = 0; i < 11; i++) {
            radio.next();
        }

        assertEquals(0,radio.getStation());
    }

    @Test
    void nextCustom() {

        for (int i = 0; i < maxStation+1; i++) {
            radioCustom.next();
        }

        assertEquals(0,radioCustom.getStation());
    }

    @Test
    void prevDefault1() {
        radio.prev();
        assertEquals(10,radio.getStation());
    }

    @Test
    void prevDefault2() {

        for (int i = 0; i < 11; i++) {
            radio.prev();
        }

        assertEquals(0,radio.getStation());
    }

    @Test
    void prevCustom1() {
        radioCustom.prev();
        assertEquals(maxStation,radioCustom.getStation());
    }

    @Test
    void prevCustom2() {

        for (int i = 0; i < maxStation+1; i++) {
            radioCustom.prev();
        }

        assertEquals(0,radioCustom.getStation());
    }

    @Test
    void testSetStation() {
        radioCustom.setStation(currentStation);
        assertEquals(currentStation,radioCustom.getStation());
    }

    @Test
    void volUp1() {
        radio.volUp();
        assertEquals(1,radio.getVolume());
    }

    @Test
    void volUp2() {

        for (int i = 0; i < Radio.maxVolumeValue+1; i++) {
            radio.volUp();
        }

        assertEquals(Radio.maxVolumeValue,radio.getVolume());
    }

    @Test
    void volDown1() {
        radio.volDown();
        assertEquals(0,radio.getVolume());
    }

    @Test
    void volDown2() {
        radio.volDown();

        for (int i = 1; i < 4; i++) {
            radio.volUp();
        }

        radio.volDown();
        assertEquals(2,radio.getVolume());
    }
}