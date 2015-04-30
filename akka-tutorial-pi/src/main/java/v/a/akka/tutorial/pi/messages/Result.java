package v.a.akka.tutorial.pi.messages;

public final class Result {
    private final double value;

    public Result(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}