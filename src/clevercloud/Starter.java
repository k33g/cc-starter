package clevercloud;

import java.lang.String;
import java.lang.System;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Starter {

  public static void main(String [] args) throws IOException, InterruptedException {
    System.out.println("👋 🌍 welcome on Clever Cloud");
    Timer timer = new Timer();
    TimerTask myTask = new TimerTask() {
      @Override
      public void run() {
        System.out.println("❤️ ... ❤️ ... I'm alive 😀");
      }
    };

    timer.schedule(myTask, 2000, 10000);
  }

}
