public class Practica8{
	public static void main(String[] args) {
		
		Fauna leon = new Leon("Leon", "Panthera leo", 2000, 
			"Animalia", "Chordata", "Mammalia");
		System.out.println(leon);
		
		Fauna gato = new Gato("Gato", "Felis silvestris catus", 12345, 
			"Animalia", "Chordata", "Mammalia");
		System.out.println(gato);

		Flora girasol = new Girasol("Girasol", "Helianthus annuus", 20, "Plantae", "Asteraceae");
		System.out.println(girasol);

		Flora rosa = new Rosa("Rosa", "Rosa rubiginosa", 5, "Plantae", "Rosaceae");
		System.out.println(rosa);

		
	}
}