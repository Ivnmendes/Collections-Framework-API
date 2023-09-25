package app4;

public class program {
	public static void main(String[] args) {
		SomaNumeros numbersList = new SomaNumeros();
		
		numbersList.addNumber(2);
		numbersList.addNumber(3);
		numbersList.addNumber(4);
		numbersList.addNumber(1);
		
		System.out.println("Soma: " + numbersList.calcSum());
		System.out.println("Maior numero: " + numbersList.searchGreaterNumber());
		System.out.println("Menor numero: " + numbersList.searchSmallestNumber());
		numbersList.showNumbers();
	}
}
