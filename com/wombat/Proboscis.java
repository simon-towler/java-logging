package com.wombat;

import java.util.logging.*;
import java.io.IOException;

public class Proboscis {
  private static Wombat wombat = new Wombat();
  private static Logger logger = Logger.getLogger("com.wombat.proboscis");
  private static Handler fh;


  public static void main(String[] args) throws IOException {
    fh = new FileHandler("mylog.txt");
    // Send logger output to our FileHandler
    logger.addHandler(fh);
    // Request that every detail gets logged
    logger.setLevel(Level.ALL);
    // Log a simple INFO message
    logger.info("doing stuff");
    try {
      wombat.sneeze();
    } catch (Exception ex) {
      logger.log(Level.WARNING, "trouble sneezing", ex);
    }
    logger.fine("done");
  }
}
/*
Dec 18, 2019 4:30:34 PM com.wombat.Proboscis main
INFO: doing stuff
Dec 18, 2019 4:30:34 PM com.wombat.Wombat sneeze
INFO: I sneezed
Dec 18, 2019 4:30:34 PM com.wombat.Proboscis main
WARNING: trouble sneezing
java.lang.Exception: I threw!
	at com.wombat.Wombat.sneeze(Wombat.java:14)
	at com.wombat.Proboscis.main(Proboscis.java:21)
*/
