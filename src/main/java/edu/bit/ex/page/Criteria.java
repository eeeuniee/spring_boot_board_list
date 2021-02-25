package edu.bit.ex.page;


import lombok.ToString;

@ToString
public class Criteria {
	// 12345678 �̷��� �� paging�� ���� �ʿ��� ��������?
	// ����¡ ó���� ���ؼ� ������ ��ȣ��
	// ���������� ��� �����͸� �����ٰ����� �����Ǿ�߸� ��.
	private int pageNum; // ������ ��ȣ
	private int amount; // ���������� ��� �����͸� �����ٰ��ΰ�?

	public Criteria() {
		this(1, 10); // �⺻�� 1������ 10���� ���� �����ڸ� ȣ���ϴ� ��
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
