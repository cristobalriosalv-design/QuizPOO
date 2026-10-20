package quiz2_MJ;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GestorAyudas {

	public static void inspeccionarRecursos(List<? extends RecursoHumanitario> elementos) {
        
		for (RecursoHumanitario elemento : elementos) {
            try 
            {
                elemento.validarParaEntregar();
                
            } catch (RecursoNoAptoException rnae) {
                System.out.println("Error de validación: " + rnae.getMessage());
                
            } finally {
                System.out.println(" Revisión individual de: " + elemento.getCodigo() +  "terminó.");
            }
        }
	}
	
	public static int contarElementos(List<?> elementos) {
		return elementos.size();
		
	}
	
	 public static void registrarKitMedico(List<? super KitMedico> destino, KitMedico elemento){
		 destino.add(elemento);
	 }
	
	 public static Map<String, RecursoHumanitario> indexarPorCodigo(List<? extends RecursoHumanitario> elementos) {
	        Map<String, RecursoHumanitario> mapa = new HashMap<>();
	        for (RecursoHumanitario recurso : elementos) {
	            mapa.put(recurso.getCodigo(), recurso);
	        }
	        return mapa;
	    }
}
