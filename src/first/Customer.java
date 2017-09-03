package first;

public class Customer {
	
	private int arrivalTime,departureTime;
	
	public Customer(int arriverTime){
		this.arrivalTime = arriverTime;
		departureTime = 0;
	}
	//获取到达时间
	public int getArrivalTime(){
		return arrivalTime;
	}
	//建立离开时间
	public void setDepartureTime(int departs){
		departureTime = departs;
		
	}
	//获取离开时间
	public int getDepartureTime(){
		return departureTime;
	}
	//获取总共消耗时间
	public int totalTime(){
		return departureTime-arrivalTime;
	}

	

}
