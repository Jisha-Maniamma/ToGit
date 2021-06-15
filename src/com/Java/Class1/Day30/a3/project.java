package com.Java.Class1.Day30.a3;

import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/15 12:46
 */
public class project {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        logger.info("hi");
        FileHandler fh=new FileHandler("Jisha"+ LocalDate.now()+".log");
        fh.setFormatter(new SimpleFormatter());

        logger.addHandler(fh);
        logger.log(Level.SEVERE,"hai");

        String SystemName
                = InetAddress.getLocalHost().getHostName();
        System.out.println(SystemName);
    }

}
class Manager implements interviewer{
    @Override
    public void conductInterview() {

    }


}
class employee{
    static void DefaultPlan(){
        System.out.println("Basic");
    }
}
interface interviewer{
    abstract void conductInterview();
    default void submitInterviewstatus(){
        System.out.println("Conducted interview");
    }

    static void bookconferenceRoom() {
        System.out.println("bookd th room on "+ LocalDate.now());
    }
}
