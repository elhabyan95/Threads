
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SecondThread implements Runnable{
    
    public void run(){
        for (int i = 5; i < 10; i++) {
            
            System.out.println(i + " from the second thread");
            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(SecondThread.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            
        }
        
        System.out.println("The second thread is completed");

    
    
    }
    
}
