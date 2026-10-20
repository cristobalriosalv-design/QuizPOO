package quiz2_MJ;

public abstract class RecursoHumanitario {

	private String codigo ;
	private int porcentajeComplejitud; 
	
	public RecursoHumanitario( String codigo , int porcentajeComplejitud) {
		this.codigo = codigo ;
		this.porcentajeComplejitud = porcentajeComplejitud ;
	}
	
	public String getCodigo() {
		return codigo ;
		
	}
	
	public int getPorcentajeComplejitud() {
		return porcentajeComplejitud ;
		
	}
	
	public abstract void obtenerDestinoPrioritario() ;
	
	public void validarParaEntregar() throws RecursoNoAptoException {
		
		if( porcentajeComplejitud > 80 ) {
			throw new RecursoNoAptoException("Recurso NO autorizado para entrega") ;
		}
		
		System.out.println("Recurso autorizado para entrega");
		
	}
	
	 /**
     "throws" :  avisar que un método puede fallar DECLARA que este método puede terminar con una
      CadenaFrioException; obliga a quien lo llame a usar try-catch
     
      "throw" : throw: es la instrucción que LANZA 
      un objeto de excepción en el momento en que la regla se rompe.
     */
}
