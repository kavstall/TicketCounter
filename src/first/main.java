package first;


public class main {
	
	final static int PROCESS = 120;
	final static int MAX_CASHIERS = 10;
	final static int NUM_CUSTOMERS = 100;

	public static void main(String[] args) {
		Customer customer;
		Queue<Customer> customerQueue = new Queue<Customer>();
		int[] cashierTime = new int[MAX_CASHIERS];
		int totalTime ,averageTime ,departs ,start;
		
		//从1到10个窗口分别模拟
		for(int cashiers=0;cashiers< MAX_CASHIERS;cashiers++){
			
			//set each cashiers time to zero initially
			for(int count = 0; count < cashiers ;count++){
				cashierTime[count] = 0;
			}
			
			for(int count=1;count<=NUM_CUSTOMERS;count++){
				customerQueue.addLast(new Customer(count*15));
				//System.out.println(customerQueue.getLast().getArrivalTime());
			}
			totalTime = 0;
			//process all customers in the queue
			while(!(customerQueue.isEmpty())){
				for(int count = 0;count<= cashiers;count++){
					if(!(customerQueue.isEmpty())){
						customer = customerQueue.remove();
						//cashierTime是售票窗口的时间，如果顾客到达时间大于 cashierTime，则表示售票窗口是空闲
						if(customer.getArrivalTime() > cashierTime[count])
							start = customer.getArrivalTime();
						else
							start = cashierTime[count];
						departs = start +PROCESS;
						customer.setDepartureTime(departs);
						cashierTime[count] = departs;
						totalTime += customer.totalTime();
					}
				}
			}
			//output results for this simulation
			averageTime = totalTime / NUM_CUSTOMERS;
			System.out.println("Number of cashiers:" +(cashiers+1));
			System.out.println("Average time:" +averageTime + "\n");
			
			
		}
		

	}

}
