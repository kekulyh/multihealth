package com.spring.util;

public class MedicationPaginationTool {
	
	private int currentPage;
	
	private int maxPage;
	
	private int everyPageAmount;
	
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getEveryPageAmount() {
		return everyPageAmount;
	}

	public void setEveryPageAmount(int everyPageAmount) {
		this.everyPageAmount = everyPageAmount;
	}
	
	
	
	
}
