
public class Exercicios {
	
	// exercicio 1 - letra a
	public static void FromMinutesToSeconds() {
		int minutes = 42;
		int seconds = 42;
		int totalSeconds;
		
		totalSeconds = (minutes * 60) + seconds;
		
		System.out.println("Total seconds is equal to: " + totalSeconds);
	}
	
	// exercicio 1 - letra b
	public static void FromKmToMiles() {
		int km = 10;
		double converterKmToMiles = 1.61;
		
		double miles = km / converterKmToMiles; 
		System.out.println("Total miles is equal to: " + miles);
	}
	
	// exercicio 1 - letra c
	public static void PaceOnMiles() {
		int km = 10;
		int minutes = 42;
		int seconds = 42;
		
		double converterKmToMiles = 1.61;
		double secondsToMinute = seconds / 60; 
		double miles = km / converterKmToMiles;
		double totalMinutes = minutes + secondsToMinute;
		double minutesToHours = totalMinutes / 60;
		double totalSeconds = totalMinutes * 60;
		
		System.out.println("Your pace on miles/seconds is: " + (miles / totalSeconds));
		System.out.println("Your pace on miles/minutes is: " + (miles / totalMinutes));
		System.out.println("Your pace on miles/hours is: " + (miles / minutesToHours));
	}
	
	// exercicio 2
	public static void TotalCostBooks() {
		double bookValue = 24.95;
		double discount = 0.4;
		int transportUniqueCost = 3;
		double transportCost = 0.75;
		
		int bookCountToSell = 60;
		
		System.out.println("Total cost of 60 books is: " + (((bookValue * (1 - discount)) * bookCountToSell) + transportUniqueCost + ((bookCountToSell - 1) * transportCost)));
		
	}
	
	public static void main(String[] args) {
		new Exercicios().FromMinutesToSeconds();
		new Exercicios().FromKmToMiles();
		new Exercicios().PaceOnMiles();
		new Exercicios().TotalCostBooks();
	}
	
}
