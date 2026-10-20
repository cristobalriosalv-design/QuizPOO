package quiz2_MJ;

public class KitAlimentos extends RecursoHumanitario{

	private String tipoAlimento ; 
	
public KitAlimentos(String codigo , int porcentajeComplejitud , String tipoAlimento) {
		
		super(codigo , porcentajeComplejitud );
		this.tipoAlimento = tipoAlimento ;
		
	}

	@Override
	public void obtenerDestinoPrioritario() {
		System.out.println("Restaurante");
	}
	
}
