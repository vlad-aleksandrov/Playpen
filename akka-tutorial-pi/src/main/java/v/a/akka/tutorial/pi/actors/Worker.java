package v.a.akka.tutorial.pi.actors;

import v.a.akka.tutorial.pi.messages.Result;
import v.a.akka.tutorial.pi.messages.Work;
import akka.actor.UntypedActor;

public class Worker extends UntypedActor {
    
    private double calculatePiFor(int start, int nrOfElements) {
        double acc = 0.0;
        for (int i = start * nrOfElements; i <= ((start + 1) * nrOfElements - 1); i++) {
          acc += 4.0 * (1 - (i % 2) * 2) / (2 * i + 1);
        }
        return acc;
      }
   
    public void onReceive(Object message) {
      if (message instanceof Work) {
        Work work = (Work) message;
        double result = calculatePiFor(work.getStart(), work.getNrOfElements());
        getSender().tell(new Result(result), getSelf());
      } else {
        unhandled(message);
      }
    }
  }
