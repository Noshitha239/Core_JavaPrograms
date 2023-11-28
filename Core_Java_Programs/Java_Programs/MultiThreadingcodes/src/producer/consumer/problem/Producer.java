package producer.consumer.problem;
public class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			a.produce(i++);
		}
	}

}
