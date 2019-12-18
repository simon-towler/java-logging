//https://docs.oracle.com/en/java/javase/12/core/java-logging-overview.html
package com.wombat;
import java.util.logging.*;
import java.io.IOException;

public class Nose {
  // Obtain a suitable logger.
  private static Logger logger = Logger.getLogger("com.wombat.nose");
  private static Wombat wombat = new Wombat();

  public static void main(String argv[]) throws IOException {

      Handler fh = new FileHandler("%t/wombat.log");
      Logger.getLogger("").addHandler(fh);//get the root logger and add the FileHandler to it
      Logger.getLogger("com.wombat").setLevel(Level.FINEST);
      /*
      The console logging below remains unchanged by the above three lines.
      What is changed is that an XML log file is now written to temp, which
      includes all the original logs to console, but now also the FINE level logs.
      */

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
