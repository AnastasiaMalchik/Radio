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
    void next() {
        radio.next();
        assertEquals(1,radio.getStation());
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        radio.next();
        assertEquals(0,radio.getStation());
    }

    @Test
    void prev() {
        radio.prev();
        assertEquals(9,radio.getStation());
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        radio.prev();
        assertEquals(0,radio.getStation());
    }

    @Test
    void volUp() {
        radio.volUp();
        assertEquals(1,radio.getVolume());
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volUp();
        assertEquals(10,radio.getVolume());
    }

    @Test
    void volDown() {
        radio.volDown();
        assertEquals(0,radio.getVolume());
        radio.volUp();
        radio.volUp();
        radio.volUp();
        radio.volDown();
        assertEquals(2,radio.getVolume());
    }
}