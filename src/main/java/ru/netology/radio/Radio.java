package ru.netology.radio;

public class Radio {

    private int station = 0;
    private int volume = 0;
    private int maxStation = 10;
    static int maxVolumeValue = 100;

    public Radio() {
    }

    public Radio(int maxStationValue) {
        maxStation = maxStationValue;
    }

    public void setStation(int stationValue) {
        station = stationValue;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next () {
        station++;

        if (station > maxStation) {
            station = 0;
        }
    }

    public void prev () {
        station--;

        if (station < 0) {
            station = maxStation;
        }
    }

    public void volUp () {
        if (volume == maxVolumeValue) {
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
