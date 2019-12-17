//https://docs.oracle.com/en/java/javase/12/core/java-logging-overview.html
package com.wombat;
import java.util.logging.*;

public class Nose {
  // Obtain a suitable logger.
  private static Logger logger = Logger.getLogger("com.wombat.nose");
  private static Wombat wombat = new Wombat();

  public static void main(String argv[]) {
    // Log a FINE tracing message
    logger.fine("doing stuff");//doesn't get output, by default
    try {
      wombat.sneeze();
    } catch (Exception ex) {
      // Log the Exception
      logger.log(Level.WARNING, "trouble sneezing", ex);
      /*
      Dec 17, 2019 8:50:44 PM com.wombat.Nose main
      WARNING: trouble sneezing
      java.lang.Exception: I threw!
	        at com.wombat.Wombat.sneeze(Wombat.java:14)
	        at com.wombat.Nose.main(Nose.java:14)
      */
    }
    logger.fine("done");//doesn't get output, by default
  }
}
