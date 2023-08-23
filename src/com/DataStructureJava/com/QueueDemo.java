package com.DataStructureJava.com;


class QueueUsingArray{
	int front_Q, rear_Q;
	int capacityofQueue;
	static int q1[];
	
	QueueUsingArray(int size){   //constructor
		capacityofQueue = size;
		q1 = new int[capacityofQueue];
	}
//	Enqueue Operation
	
	void enqueue(int value){  //enqueue condition
		if(rear_Q == capacityofQueue){
			System.out.println("queue is already full, you can't insert element..");
		}
		else{
			q1[rear_Q] = value;
			rear_Q++;
		}
	}
	
//	Dequeue() condition
	void dequeue(){
		if(rear_Q == 0){
			System.out.println("queue is empty, there is nothing to delete..");
		}
		else{
			for(int i=0;i<rear_Q-1;i++){
				q1[i] = q1[i+1];
			}
			rear_Q--;
		}
		
}
//	Display() elements
	
	void display(){
		if(rear_Q == 0){
			System.out.println("queue is empty, nothing to display..");
		}
		else{
			for(int i=0;i<rear_Q;i++){
				System.out.print(q1[i]+" ");
			}
			
		}
			
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		
		QueueUsingArray q2 = new QueueUsingArray(5);
		q2.enqueue(2);
		q2.enqueue(4);
		q2.enqueue(8);
		q2.enqueue(7);
		q2.display();//output : 2 4 8 7 
		
		q2.dequeue();
		System.out.println();
		q2.display();//output : 4 8 7 
		
	}

}
