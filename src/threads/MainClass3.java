
package threads;

public class MainClass3 {

    public static void main(String[] args) {
        
        FirstThread th1 = new FirstThread();
        th1.start();
        
        SecondThread th2 = new SecondThread();
        
        Thread thread = new Thread(th2);
        thread.start();
        
        for(int i=100;i<200;i+=50){
            System.out.println(i + " from the main thread");

        }
        System.out.println("The main thread is completed");
    }
    
}
