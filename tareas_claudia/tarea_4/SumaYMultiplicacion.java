public class SumaYMultiplicacion{
	
	private int[][] arr1;

	public SumaYMultiplicacion(int[][] arr1){
		this.arr1 = arr1;
	}

	public int sumaMatrices(){
		int total = 0;
		for (int i = 0 ; i<arr1.length ; i++) {
			for (int j = 0 ; j<arr1[i].length ; j++) {
				total += arr1[i][j];
			}
		}
		return total;
	}

	public int multiplicarMatrices(){
		int total = 1;
		for (int i = 0 ; i<arr1.length ; i++) {
			for (int j = 0 ; j<arr1[i].length ; j++) {
				total *= arr1[i][j];
			}
		}
		return total;	
	}

	public static void main(String[] args) {
	
		int a[][] = {{1,2}, {3,4}, {5,6}};
		SumaYMultiplicacion ma = new SumaYMultiplicacion(a);
		
		System.out.println(ma.sumaMatrices());
		System.out.println(ma.multiplicarMatrices());

	}
}