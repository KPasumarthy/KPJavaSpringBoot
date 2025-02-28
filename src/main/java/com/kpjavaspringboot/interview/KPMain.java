package com.kpjavaspringboot.interview;


import com.kpjavaspringboot.KPJavaSpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Arrays;

public class KPMain {

    private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

    public static void main(String[] args) {

        // KP : Debug Print
        logger.info("KP : KPJavaSpringBootApplication : main() : " + LocalDateTime.now());
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() : " + LocalDateTime.now());

        ///KP : Write program to get square of no -3,-2,-1,0,4,5,6 in sorted order
        int[] Input = {-3, -2, -1, 0, 4, 5, 6};
        int n = Input.length;

        int[] Output = new int[n - 1];

        System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  n = " + n);

        for (int i = 0; i < n - 1; i++) {
            int tmp = Input[i];
            System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  tmp  = " + tmp + " (tmp * tmp) = " + (tmp * tmp) + " (int) (Math.pow(tmp, 2); " + (int) (Math.pow(tmp, 2)));
            Output[i] = (tmp * tmp);
        }

        Arrays.sort(Output);
        System.out.println("KP : KPMain - com.kpjavaspringboot : main() :  Output = " + Arrays.toString(Output));

    }

}
