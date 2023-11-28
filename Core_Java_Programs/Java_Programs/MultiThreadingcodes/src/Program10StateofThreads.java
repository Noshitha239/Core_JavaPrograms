class Fighter extends Thread{
	String res1 = "AK47";
	String res2 = "M24";
	String res3 = "Sniper";
	@Override
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("Arjun")) {
				arjunSnatched();
			}
			else {
				sunilSnatched();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void arjunSnatched() throws InterruptedException{
		synchronized (res1) {
			System.out.println(Thread.currentThread().getName()+"has snatched "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println(Thread.currentThread().getName()+"has snatched "+res2);
				Thread.sleep(3000);
				synchronized (res3) {
					System.out.println(Thread.currentThread().getName()+"has snatched "+res3);
					Thread.sleep(3000);

				}
			}

		}
	}
	public void sunilSnatched() throws InterruptedException{
		synchronized (res1) {
			System.out.println(Thread.currentThread().getName()+"has snatched "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println(Thread.currentThread().getName()+"has snatched "+res2);
				Thread.sleep(3000);
				synchronized (res3) {
					System.out.println(Thread.currentThread().getName()+"has snatched "+res3);
					Thread.sleep(3000);

				}
			}

		}
	}
}
public class Program10StateofThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f1= new Fighter();
		f1.setName("Arjun");
		Fighter f2=new Fighter();
		f2.setName("Sunil");
		f1.start();
		f2.start();

	}

}
