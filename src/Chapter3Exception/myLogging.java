package Chapter3Exception;

import java.util.logging.Logger;

public class myLogging {
    public void myLogginTest(){
        Logger logger = Logger.getGlobal();
        logger.info("this is global info");

        Logger logger2 = Logger.getLogger("LOG2");
        logger2.warning("this is log2");

    }
}
