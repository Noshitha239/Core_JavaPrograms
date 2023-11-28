package producer.consumer.problem;
public class Queue {
    int x;
	public void produce(int i) {
		// TODO Auto-generated method stub
		x=i;
		System.out.println("Producer has produce the data" +x);
	}

	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("Consumer has produce the data" +x);
	}  
}
