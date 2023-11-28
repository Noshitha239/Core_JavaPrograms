package producer.consumer.solution;

public class Queue {
	int x;
	boolean value_of_x=false;
	synchronized void produce(int i) {
		// TODO Auto-generated method stub
		try {
			if(value_of_x==false) {
			x=i;
			System.out.println("Producer has produce the data" +x);
			value_of_x=true;
			notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized void consume() {
		try {
			if(value_of_x==true) {
			System.out.println("consumer has produce the data" +x);
			value_of_x=false;
			notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}  
}


