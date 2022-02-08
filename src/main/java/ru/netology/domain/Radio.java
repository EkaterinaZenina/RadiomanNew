package ru.netology.domain;

public class Radio {
    private int channelAmount = 20;
    private int currentChannel;
    private final int minChannel = 0;
    private final int maxChannel = 9;

    public Radio() {
    }
    public Radio( int channelAmount) {
        this.channelAmount = channelAmount;
    }


    public int getCurrentChannel() {
       return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > channelAmount - 1) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel(){
        if (currentChannel == maxChannel ) {
           currentChannel = channelAmount + 1;
        }
        else {
            currentChannel = currentChannel + 1;
        }

    }
    public void prevChannel(){
        if (currentChannel == minChannel){
            this.currentChannel = channelAmount -1;
        }
        else {
            this.currentChannel = currentChannel - 1;
        }
    }

    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 10;

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
