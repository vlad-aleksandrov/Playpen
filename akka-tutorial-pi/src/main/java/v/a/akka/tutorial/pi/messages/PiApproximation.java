package v.a.akka.tutorial.pi.messages;

import scala.concurrent.duration.Duration;

public final class PiApproximation {
    private final double pi;
    private final Duration duration;
   
    public PiApproximation(double pi, Duration duration) {
      this.pi = pi;
      this.duration = duration;
    }
   
    public double getPi() {
      return pi;
    }
   
    public Duration getDuration() {
      return duration;
    }
  }