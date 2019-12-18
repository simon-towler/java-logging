package com.wombat;
import java.util.logging.*;

class Wombat {

  static Logger logger = Logger.getLogger("com.wombat.wombat");

  public void sneeze() throws Exception {
    logger.info("I sneezed");
    /*
    Dec 17, 2019 8:41:35 PM com.wombat.Wombat sneeze
    INFO: I sneezed
    */
    throw new Exception("I threw!");
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
