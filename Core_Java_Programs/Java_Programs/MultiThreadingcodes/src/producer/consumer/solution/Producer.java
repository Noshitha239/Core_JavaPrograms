package producer.consumer.solution;

public class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	public void run() {
		int i=0;
		while(true) {
			a.produce(i++);
		}
	}

}


