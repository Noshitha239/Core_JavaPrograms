public class Program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t1=Thread.currentThread();
        System.out.println(t1);
        Thread t2=new Thread();
        System.out.println(t2);
        t2.setName("Noshi");
        t2.setPriority(8);
        System.out.println(t2);
	}

}
