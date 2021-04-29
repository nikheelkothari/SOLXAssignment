package data;

import java.util.List;

public class RowDetails {
	
	private String id;
	private String key;
	private Value value;
	private List<Counter1> counter1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	public List<Counter1> getCounter1() {
		return counter1;
	}
	public void setCounter1(List<Counter1> counter1) {
		this.counter1 = counter1;
	}

}
