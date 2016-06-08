package aeronautique;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unAvion());
	}

		private static Avion unAvion(){
			Avion unAvion = new Avion(1000, "Boeing", "Rennes", 300);
			
			return unAvion;
			
		}
}
