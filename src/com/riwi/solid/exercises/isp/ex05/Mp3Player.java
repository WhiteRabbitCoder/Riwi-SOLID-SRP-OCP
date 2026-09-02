package com.riwi.solid.exercises.isp.ex05;

public class Mp3Player implements MediaDevice {
    @Override public void playAudio() { System.out.println("Reproduciendo audio"); }
    @Override public void playVideo() { throw new UnsupportedOperationException(); }
    @Override public void record() { throw new UnsupportedOperationException(); }
}
