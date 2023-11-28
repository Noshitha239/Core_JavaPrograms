class Operations1 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThreadGroup tg=new ThreadGroup("Group1");
        ThreadGroup tg1=new ThreadGroup("Group2");
        Thread t1=new Thread(tg,new Operations1(),"t1");
        Thread t2=new Thread(tg1,new Operations1(),"t2");
        Thread t3=new Thread(tg,new Operations1(),"t3");
        Thread t4=new Thread(tg1,new Operations1(),"t3");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(tg.activeCount());
        System.out.println(tg.activeGroupCount());
        System.out.println(tg.getMaxPriority());
        
     
	}

}
