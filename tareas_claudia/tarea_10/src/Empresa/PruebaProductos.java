/**
 * <p>Tarea 10: Herencia</p>
 *
 * Clase que muestra ejemplos de Objetos con herencias
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 16-nov-15.
 */
public class PruebaProductos{

    public static void main(String[] args){
        ProductosCongeladosPorAgua pescado =
                new ProductosCongeladosPorAgua(2.4, 12051996, 123456, 666, "Mexico", 30);

        ProductosCongeladosPorAire arrachera =
                new ProductosCongeladosPorAire(new String[]{"10%", "8%", "2%", "9%" },
                        12051998, 999, 12769909, "Israel", 5);

        ProductosCongeladosPorNitrogeno muestraLAboratorio =
                new ProductosCongeladosPorNitrogeno("Nitrogeno asi bien frio",
                        1.00, 12071007, 6189, 127, "Rusia", -20);

        ProductosFrescos quesoOaxaca = new ProductosFrescos(99019999, 66, 14112015, "Mexico");

        System.out.println("\nMuestra de laboratorio: "+ muestraLAboratorio);
        System.out.println("\nPescado: " + pescado);
        System.out.println("\nArrachera: " + arrachera);

        System.out.println("\nQueso oaxaca: " + quesoOaxaca);
    }

}