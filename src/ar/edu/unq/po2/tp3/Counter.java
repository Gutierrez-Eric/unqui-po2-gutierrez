package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public Counter() {
	}



	public void addNumber(Integer number) {
		this.numbers.add(number);
	}
	
	public Integer getEvenOcurrences() {
		Integer count = 0;
		for (Integer number : this.numbers){
			if(this.isEven(number)) {
				count=+1;
			} 
		}
		return count;
	}
	
	public Boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	
	public Integer getOddOcurrences() {
		Integer count = 0;
		for (Integer number: this.numbers) {
			if(!this.isEven(number)) {
				count++;
			}
		}
		return count;
	}
	
	public Integer getMultipleOcurrences(Integer number){
		Integer count = 0;
		for(Integer numberAct : this.numbers) {
			if(this.isMultiple(numberAct,number)) {
				count++;
			}
		}
		return count;
	}
	
	public Boolean isMultiple(Integer number1, Integer number2) {
		return number1 % number2 == 0;
	}	
	
}
