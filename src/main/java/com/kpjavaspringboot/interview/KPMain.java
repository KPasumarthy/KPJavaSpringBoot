package com.kpjavaspringboot.interview;


import com.kpjavaspringboot.KPJavaSpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class KPMain {

    private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

    public static void main(String[] args) {

        // KP : Debug Print
        logger.info("KP : KPJavaSpringBootApplication : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() : " + LocalDateTime.now());
    }


}
