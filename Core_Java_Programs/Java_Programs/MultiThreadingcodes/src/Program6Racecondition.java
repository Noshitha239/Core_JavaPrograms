class MSOffice extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}
		if(Thread.currentThread().getName().equals("SpellCheck")) {
			spellCheck();
		}
		if(Thread.currentThread().getName().equals("Saving")) {
			saving();
		}
	}
	private void typing() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	private void spellCheck() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				System.out.println("SpellCheck....");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void saving() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Saving....");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	
}
public class Program6Racecondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MSOffice ms1=new MSOffice();
        MSOffice ms2=new MSOffice();
        MSOffice ms3=new MSOffice();
        
        ms1.setName("Typing");
        ms2.setName("SpellCheck");
        ms3.setName("Saving");
        
        ms1.start();
        ms2.start();
        ms3.start();
        
	}

}
