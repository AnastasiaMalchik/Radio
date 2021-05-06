package ru.netology.radio;

public class Radio {

    private int station = 0;
    private int volume = 0;

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next () {
        station++;

        if (station > 9) {
            station = 0;
        }
    }

    public void prev () {
        station--;

        if (station < 0) {
            station = 9;
        }
    }

    public void volUp () {
        if (volume == 10) {
            return;
        }

        volume++;
    }

    public void volDown () {
        if (volume == 0) {
            return;
        }

        volume--;
    }
}
