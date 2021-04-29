package data;

import java.util.List;

public class Json {
	
	private String total_rows;
	private String offset;
	private List<RowDetails> rows;
	private String date;
	
	public String getTotal_rows() {
		return total_rows;
	}
	public void setTotal_rows(String total_rows) {
		this.total_rows = total_rows;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public List<RowDetails> getRows() {
		return rows;
	}
	public void setRows(List<RowDetails> rows) {
		this.rows = rows;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Json [total_rows=" + total_rows + ", offset=" + offset + ", rows=" + rows + ", date=" + date + "]";
	}

}
