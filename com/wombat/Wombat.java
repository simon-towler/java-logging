package com.wombat;
import java.util.logging.*;

class Wombat {

  Logger logger = Logger.getLogger("com.wombat.wombat");

  public void sneeze() throws Exception {
    logger.info("I sneezed");
    /*
    Dec 17, 2019 8:41:35 PM com.wombat.Wombat sneeze
    INFO: I sneezed
    */
    throw new Exception("I threw!");
  }

}
