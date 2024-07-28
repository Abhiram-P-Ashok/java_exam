class myRunnable implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Multi_run{
    public static void main(String args[]){
        myRunnable MyRun1 = new myRunnable();
        myRunnable MyRun2 = new myRunnable();

        Thread t1 = new Thread(MyRun1,"January 1st is monday");
        Thread t2 = new Thread(MyRun2,"January 2nd is tuesday");
        t1.start();
        t2.start();
    }
}
