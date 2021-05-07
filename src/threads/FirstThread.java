
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class FirstThread extends Thread{
    
    public void run(){
    for(int i=0;i<5;i++){
        System.out.println(i + " from the first thread");
        
        try {
            Thread.sleep(750);
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(FirstThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    System.out.println("The first thread is completed");
    
    }
    
}
