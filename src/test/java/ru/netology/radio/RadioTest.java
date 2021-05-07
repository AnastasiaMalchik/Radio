package ru.netology.radio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio;

    @BeforeEach
    void setUp() {
        radio = new Radio();
    }

    @Test
    void next1() {
        radio.next();
        assertEquals(1,radio.getStation());
    }

    @Test
    void next2() {

        for (int i = 1; i < 11; i++) {
            radio.next();
        }

        assertEquals(0,radio.getStation());
    }

    @Test
    void prev1() {
        radio.prev();
        assertEquals(9,radio.getStation());
    }

    @Test
    void prev2() {

        for (int i = 1; i < 11; i++) {
            radio.prev();
        }

        assertEquals(0,radio.getStation());
    }

    @Test
    void volUp1() {
        radio.volUp();
        assertEquals(1,radio.getVolume());
    }

    @Test
    void volUp2() {

        for (int i = 1; i < 12; i++) {
            radio.volUp();
        }

        assertEquals(10,radio.getVolume());
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