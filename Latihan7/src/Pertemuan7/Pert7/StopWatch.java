package Pertemuan7.Pert7;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getTimeElapsed() {
        return endTime - startTime;
    }

    public String getElapsedTime() {
        long elapsedTime = getTimeElapsed();
        return String.format("Elapsed time: %d ms", elapsedTime); // Format elapsed time nicely
 
    }
}
