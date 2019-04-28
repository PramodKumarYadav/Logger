import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log4j {
    private final static Logger logger = Logger.getLogger(Log4j.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {

        logger.info("Logger Name: "+ logger.getName());
        logger.info("Logger Name: "+ logger.getLevel());
        logger.info("Logger Name: "+ logger.getHandlers());
        logger.warning("Can cause ArrayIndexOutOfBoundsException");

        //An array of size 3
        int []a = {1,2,3};
        int index = 4;
        logger.config("index is set to "+index);

        try{
            System.out.println(a[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
            logger.log(Level.SEVERE, "Exception occur", ex);
        }


    }
}
    