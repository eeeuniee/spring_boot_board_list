package edu.bit.ex.page;


import lombok.ToString;

@ToString
public class Criteria {
	// 12345678 이런게 들어감 paging을 위해 필요한 변수들은?
	// 페이징 처리를 위해선 페이지 번호와
	// 한페이지당 몇개의 데이터를 보여줄것인지 결정되어야만 함.
	private int pageNum; // 페이지 번호
	private int amount; // 한페이지당 몇개의 데이터를 보여줄것인가?

	public Criteria() {
		this(1, 10); // 기본값 1페이지 10개로 지정 생성자를 호출하는 것
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
