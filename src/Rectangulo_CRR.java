
/**
 * 
 * @author Carmelo Ricarte Rocamora
 * @version 1.1
 */

public class Rectangulo_CRR extends FiguraGeometrica_CRR {
	private double l1;
	private double l2;
	
	public Rectangulo_CRR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/* Metodo para calcular el area del rectangulo multipliando el lado1 y lado2.
	 * @see FiguraGeometrica_CRR#area()
	 * @param l1
	 * @param l2 
	 * @return double
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/* Metodo para calcular el perimetro del rectangulo. Cada lado se multiplica por dos ya que 
	 * y se suman los dos resultados.
	 * @see FiguraGeometrica_CRR#perimetro()
	 * @param l1 
	 * @param l2 
	 * @return double
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
