package quiz2_MJ;
import java.util.List; 


public class GestorAyudas {

	public static void inspeccionarRecursos(List<? extends RecursoHumanitario> elementos) {
        
		for (Object elemento : elementos) {
            try {

            	RecursoHumanitario recurso = (RecursoHumanitario) elemento;
                recurso.validarParaEntregar();
                
            } catch (RecursoNoAptoException e) {
                System.out.println("Error de validación: " + e.getMessage());
                
            } finally {
                System.out.println(" Revisión individual terminó.");
            }
        }
	}
	
	public static int contarElementos(List<?> elementos) {
		return elementos.size();
		
	}
	
	
}
