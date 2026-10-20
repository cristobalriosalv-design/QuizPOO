package quiz2_MJ;
import java.util.List;
import java.util.ArrayList;


public class RegistroAyudas<T extends RecursoHumanitario> {

	List<T> lista = new ArrayList<>();
	
	public void agregar(T elemento) {
		lista.add(elemento);
	}
	
	public void listar() {
		
		for (T lista : lista) {
            System.out.println(lista);
        }
	}
	
	public int cantidad() {
		return lista.size();
	}
	
}
