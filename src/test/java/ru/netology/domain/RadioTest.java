package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setCurrentChannel() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(1);
        int expected = 1;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannel0() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(0);
        int expected = 0;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannelBelowMin() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(-1);
        int expected = 0;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannelOverMax() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(70);
        int expected = 0;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextChannel() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(5);
        Radio.nextChannel();
        int expected = 6;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextChannel0() {
        Radio Radio = new Radio(25);
        Radio.setCurrentChannel(24);
        Radio.nextChannel();
        int expected = 25;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void setPrevChannel() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(5);
        Radio.prevChannel();
        int actual = Radio.getCurrentChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void setPrevChannel99() {
        Radio Radio = new Radio(100);
        Radio.setCurrentChannel(0);
        Radio.prevChannel();
        int actual = Radio.getCurrentChannel();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(7);
        int expected = 7;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeFrom0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(-7);
        int expected = 0;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeOverMax() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(170);
        int expected = 10;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolume() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(0);
        Radio.increaseVolume();
        int expected = 1;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolumeOverMax() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(35);
        Radio.increaseVolume();
        int expected = 10;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(10);
        Radio.decreaseVolume();
        int expected = 9;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolumeBelowMin() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(-50);
        Radio.decreaseVolume();
        int expected = 0;
        int actual = Radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void set55from1000Constructor() {
        Radio Radio = new Radio(1000);
        Radio.setCurrentChannel(55);
        int expected = 55;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void increase55from1000Constructor() {
        Radio Radio = new Radio(1000);
        Radio.setCurrentChannel(55);
        Radio.nextChannel();
        int expected = 56;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void set15from20Constructor() {
        Radio Radio = new Radio(20);
        Radio.setCurrentChannel(15);
        int expected = 15;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void decrease15from20Constructor() {
        Radio Radio = new Radio(20);
        Radio.setCurrentChannel(15);
        Radio.prevChannel();
        int expected = 14;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void increase15from20Constructor() {
        Radio Radio = new Radio(20);
        Radio.setCurrentChannel(15);
        Radio.nextChannel();
        int expected = 16;
        int actual = Radio.getCurrentChannel();
        assertEquals(expected, actual);
    }
}