package quiz2_MJ;

public class KitMedico extends RecursoHumanitario{

	private String tipoMedicina;
	
	public KitMedico(String codigo , int porcentajeComplejitud , String tipoMedicina) {
		
		super(codigo , porcentajeComplejitud );
		this.tipoMedicina = tipoMedicina ;
			
	}
	
	@Override
	public void obtenerDestinoPrioritario() {
		System.out.println("Hospital");
	}
	
}
