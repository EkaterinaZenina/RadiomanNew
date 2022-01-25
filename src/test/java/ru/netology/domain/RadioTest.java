package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setCurrentChannel() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentChannel(expected);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void increaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.nextChannel();;
        int expected = 8;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.prevChannel();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void returnMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(14);
        radio.nextChannel();
        int expected =0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void returnMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }


    @Test
    void setChannelOverMax() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentChannel(20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void setChannelBelowMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(-20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentVolume(expected);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(52);
        radio.increaseVolume();
        int expected = 53;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(61);
        radio.decreaseVolume();
        int expected =60;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    void setVolumeOverMax() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void sVolumeBelowMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-50);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}