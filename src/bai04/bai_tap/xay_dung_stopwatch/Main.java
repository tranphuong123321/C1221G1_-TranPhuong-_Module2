package bai04.bai_tap.xay_dung_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime());
        stopWatch.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
