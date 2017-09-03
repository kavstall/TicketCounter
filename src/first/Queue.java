package first;

import java.util.LinkedList;

public class Queue<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	//队尾插入
	public void addLast(T v) {
		list.addLast(v); 
	}
	//取得队元首素
	public T getFirst() {
		return list.getFirst(); 
	}
	//获取队首元素，并把队首元素移除
	public T remove() {
		T temp = list.getFirst();
		list.removeFirst(); 
		return temp;
	}
	//获取队尾元素
	public T getLast(){
		return list.getLast();
	}
	//判断队列是否为空
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
