package bai04.bai_tap.xay_dung_stopwatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public  void  start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
         this.endTime = new Date().getTime();

    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
