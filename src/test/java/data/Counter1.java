package data;

import java.util.List;

public class Counter1 {
	
	private String id;
	private List<Counter2> counter2;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Counter2> getCounter2() {
		return counter2;
	}
	public void setCounter2(List<Counter2> counter2) {
		this.counter2 = counter2;
	}

}
