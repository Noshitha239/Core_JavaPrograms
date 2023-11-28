package producer.consumer.problem;
public class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	public void run() {
		while(true) {
			b.consume();
		}
	}

}
