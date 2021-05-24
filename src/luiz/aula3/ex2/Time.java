package luiz.aula3.ex2;

public class Time {
    private Long start;

    private Long end;

    public void start() {
        start = System.nanoTime();
    }

    public void end() {
        end = System.nanoTime();
    }

    public Long elapsedTime() {
        return end - start;
    }

    public void reset() {
        start = 0L;
        end = 0L;
    }
}
