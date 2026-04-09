package Multithreading;

public class ThreadExample extends Thread {
    @Override
    public void run(){
        System.out.println("RUNNING");
        try{
        Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        
    }
    public static void main(String[] args) throws InterruptedException {
    ThreadExample t1 = new  ThreadExample();
    System.out.println(t1.getState()); // New 
    t1.start(); // Runnable
    System.out.println(t1.getState()); // Now it is in RUNNABLE state
    Thread.sleep(100); // Here we are pausing Main thread so t1 get to execute and we are printing "RUNNING " State becouse there is no predefine RUNNING state
    System.out.println(t1.getState());
    t1.join(); // Here Main Thread will wait to finish t1 

    
    System.out.println(t1.getState()); // After t1 is completed now it is in  terminated state 
    


  
        
    }
    
}