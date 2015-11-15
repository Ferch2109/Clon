import java.io.*;
import java.util.ArrayList;

/**
 * <p>Clase que muestra la escritura y lectura de archivos</p>
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 08-ago-15.
 */
public class Main{
	
	public static void main(String[] args){

	String fileName=args[0]; //El nombre del archivo se pasa como argumento

	String testCases = null;
	int tot = 0;

 	ArrayList<String> list = new ArrayList<>();
	
	 //LEER
	try{
		//Creamos un objeto de FileReader
		FileReader input = new FileReader(fileName);
		//Creamos un objeto bufferReader 
	 	BufferedReader reader = new BufferedReader(input);

		//Variable to hold the one line data
	 	String line;


	 	int i = 0;
		//Leemos línea por línea y lo imprimimos
	 	while ((line = reader.readLine()) != null)   {
	 		if (i == 0){
	 			testCases = line;
	 			i++;
	 		}else{
	 			list.add(line);

	 		}
	 	}
		//Cerramos el buffer (nos aseguramos que no se pierdan los datos)
	 	reader.close();
	 	//list.forEach(n -> System.out.println(n));
	 }catch(Exception e){
	 	System.out.println("Error" + e.getMessage());                      
	 }

	 //ESCRIBIR
	 try {
	 	FileWriter fileWriter = new FileWriter(args[1]);

	 	BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter);

	 	for (int i = 0; i<Integer.parseInt(testCases) ; i++) {
	 		bufferedWriter.write("Case #" + (i+1) + " = " + Converter.converter(list.get(i)));
	 		bufferedWriter.newLine();
	 	}

	 	bufferedWriter.close();
	 }catch(IOException ex) {
	 	System.out.println("Error writing to file '" + fileName + "'");

	 }

	}
}