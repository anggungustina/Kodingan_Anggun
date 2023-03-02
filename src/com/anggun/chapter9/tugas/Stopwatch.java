package com.anggun.chapter9.tugas;

public class Stopwatch {
    private long starTime;
    private long endTime;

    Stopwatch(){
        starTime = System.currentTimeMillis();

    }
    public void start(){
        starTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return getEndTime() - getStratTime();
    }

    public long getStratTime(){
        return  starTime;
    }
    public  long getEndTime(){
        return endTime;
    }
}
