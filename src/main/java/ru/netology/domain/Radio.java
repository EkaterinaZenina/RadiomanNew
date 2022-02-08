package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 9;

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
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume=currentVolume;

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if(currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume(){
        if(currentVolume > 0) {
            this.currentVolume = currentVolume -1;
        }
        return;
    }
}