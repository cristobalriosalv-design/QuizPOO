package quiz2_MJ;
import java.util.List;
import java.util.ArrayList;


public class RegistroAyudas<T extends RecursoHumanitario> {

	private List<T> lista = new ArrayList<>();
	
	public void agregar(T elemento) {
		lista.add(elemento);
	}
	
	public List<T> listar()
	{
		return lista;
	}
	
	public int cantidad() {
		return lista.size();
	}
	
}
