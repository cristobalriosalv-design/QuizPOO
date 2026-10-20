package quiz2_MJ;

import java.util.Objects;

public abstract class RecursoHumanitario {

	private String codigo ;
	private int porcentajeCompletitud; 
	
	public RecursoHumanitario( String codigo , int porcentajeComplejitud) {
		this.codigo = codigo ;
		this.porcentajeCompletitud = porcentajeComplejitud ;
	}
	
	public String getCodigo() {
		return codigo ;
		
	}
	
	public int getPorcentajeComplejitud() {
		return porcentajeCompletitud ;
		
	}
	
	public abstract String obtenerDestinoPrioritario() ;
	
	public void validarParaEntregar() throws RecursoNoAptoException {
		
		if( porcentajeCompletitud < 80 ) {
			throw new RecursoNoAptoException("Recurso " + codigo + "NO autorizado para entrega."
					+ " Su completitud de " + porcentajeCompletitud + "% está por debajo de 80%") ;
		}
		
		System.out.println("Recurso autorizado para entrega");
		
	}
	
	 /**
     "throws" :  avisar que un método puede fallar DECLARA que este método puede terminar con una
      CadenaFrioException; obliga a quien lo llame a usar try-catch
     
      "throw" : throw: es la instrucción que LANZA 
      un objeto de excepción en el momento en que la regla se rompe.
     */
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true; //Si el objeto es literalmente si mismo, retorna true sin gastar más recurso
		}
		if (!(obj instanceof RecursoHumanitario))
		{
			return false; //Si el objeto no es siquiera un RecursoHumanitario, retorna false sin gastar más recurso
		}
		
		RecursoHumanitario re = (RecursoHumanitario) obj; //Hacer un casting manual para cambiar de Object -> RecursoHumanitario
		
		return Objects.equals(codigo, re.codigo);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(codigo);
	}
	
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + "Código: " + codigo + ", porcentaje de completitud: " + porcentajeCompletitud + "%";
	}
	
}
