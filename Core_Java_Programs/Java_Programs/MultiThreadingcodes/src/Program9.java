class Human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" Entering the Bathroom");
			System.out.println(Thread.currentThread().getName()+" Using the Bathroom");
			System.out.println(Thread.currentThread().getName()+" Left the Bathroom");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class Program9 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Human h1=new Human();
        h1.setName("Boy");
        Human h2=new Human();
        h2.setName("Girl");
        Human h3=new Human();
        h3.setName("Others");
        h1.start();
//        h1.join();
        h2.start();
//        h1.join();
        h3.start();
//        h3.join();
        
	}
}
