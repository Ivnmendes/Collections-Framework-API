package app4;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numbersList;

	public SomaNumeros() {
		this.numbersList = new ArrayList<>();
	}
	
	public void addNumber(int n) {
		this.numbersList.add(n);
	}
	
	public int calcSum() {
		int sum = 0;
		if(!numbersList.isEmpty()) {
			for(Integer n : numbersList) {
				sum += n;
			}
		}

		return sum;
	}
	
	public int searchGreaterNumber() {
		int greaterNumber = 0;
		if(!numbersList.isEmpty()) {
			greaterNumber = numbersList.get(0);
			for(Integer n : numbersList) {
				if(n > greaterNumber) {
					greaterNumber = n;
				}
			}
		}
		return greaterNumber;
	}
	
	public int searchSmallestNumber() {
		int smallestNumber = 0;
		if(!numbersList.isEmpty()) {
			smallestNumber = numbersList.get(0);
			for(Integer n : numbersList) {
				if(n < smallestNumber) {
					smallestNumber = n;
				}
			}
		}
		return smallestNumber;
	}
	
	public void showNumbers() {
		for(Integer n : numbersList) {
			System.out.printf("%d ", n);
		}
	}
}
