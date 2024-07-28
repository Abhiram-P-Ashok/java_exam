public class Multi_thread extends Thread {
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println(Thread.currentThread().getName()+";"+1);
            try {
                Thread.sleep(300);
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Multi_thread t1= new Multi_thread();
        System.out.println("Name of thread 't1' "+t1.getName());
        Multi_thread t2 = new Multi_thread();
        System.out.println("Name of thread 't2' "+t2.getName());

        t1.setName("January is monday");
        t2.setName("January 2nd is tuesday");
        t1.start();
        t2.start();
        System.out.println("New name of thread 't1' "+t1.getName());
        System.out.println("New name of thread 't2' "+t2.getName());
    }
}
