package es.studium.Refactorizacion;

public class Refactorizacion
{

	public double calcularPrecio(int unidades, double precioUnitario) {
		final int IVA = 21;
		return((((unidades*precioUnitario)*IVA)/100)+(unidades*precioUnitario));
		
	}
	
}
