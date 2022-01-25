package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }
    public Radio(int channels) {
    }


    public int getCurrentChannel() {
       return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel){
            this.currentChannel = maxChannel;
        return;
    }
        this.currentChannel = currentChannel;

        if (currentChannel< minChannel){
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel(){
        if (currentChannel < 9) {
            this.currentChannel = currentChannel +1;
            return;
        }
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }

    }
    public void prevChannel(){
        if (currentChannel > 0){
            this.currentChannel = currentChannel -1;
            return;
        }
        if (currentChannel == minChannel){
            this.currentChannel = maxChannel;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if(currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume(){
        if(currentVolume > minVolume) {
            this.currentVolume = currentVolume -1;
        }
        return;
    }
}
