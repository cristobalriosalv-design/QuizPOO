package quiz2_MJ;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class Master  {
    public static void main(String[] args) {

    	RegistroAyudas<KitMedico> registroMedico = new RegistroAyudas<>();
		 
		 KitMedico m1 = new  KitMedico("MED-111", 78, "curitas de hotwheels");
		 KitMedico m2 = new  KitMedico("MED-222", 100, "supositorios");
		 KitMedico m3 = new  KitMedico("MED-333", 81, "tapabocas");
		 
		 registroMedico.agregar(m1);
		 registroMedico.agregar(m2);
		 registroMedico.agregar(m3);
		 
		 System.out.println("Cantidad en el registro: " + registroMedico.cantidad());
		 
		 for(KitMedico unidad : registroMedico.listar())
		 {
			 System.out.println(unidad.getCodigo() + " | Tipo: " 
		 + unidad.getTipoMedicina()
		 + " | Prioridad: " + unidad.obtenerDestinoPrioritario());
			 
		 }
    	
        List<KitMedico> kitsMedicos = new ArrayList<>();
        kitsMedicos.add(new KitMedico("MED-101", 90, "dolex")); 
        kitsMedicos.add(new KitMedico("MED-102", 50, "condones")); 

        System.out.println("PRUEBA DE INSPECCIÓN Y EXCEPCIONES");
        GestorAyudas.inspeccionarRecursos(kitsMedicos);

        System.out.println("PRUEBA DE REGISTRO SEGURO");
        KitMedico kitNuevo = new KitMedico("MED-200", 85, "curitas de cars");
        
        List<KitMedico> listaSoloMedicos = new ArrayList<>();
        List<RecursoHumanitario> listaGeneral = new ArrayList<>();

        GestorAyudas.registrarKitMedico(listaSoloMedicos, kitNuevo);
        GestorAyudas.registrarKitMedico(listaGeneral, kitNuevo);

        System.out.println("PRUEBA DE INDEXACIÓN POR CÓDIGO");
        List<RecursoHumanitario> todosLosRecursos = new ArrayList<>();
        todosLosRecursos.addAll(kitsMedicos);
        todosLosRecursos.add(kitNuevo);

        Map<String, RecursoHumanitario> mapaIndexado = GestorAyudas.indexarPorCodigo(todosLosRecursos);
        System.out.println("Claves registradas en el Map: " + mapaIndexado.keySet());

        System.out.println("PRUEBA DE CONTEO CON WILDCARDS");
        int cantidadKits = GestorAyudas.contarElementos(kitsMedicos);
        int cantidadGeneral = GestorAyudas.contarElementos(todosLosRecursos);

        System.out.println("Cantidad de elementos en de kits médicos: " + cantidadKits);
        System.out.println("Cantidad de elementos general de recursos: " + cantidadGeneral);

        System.out.println("PRUEBA EXTRA: HASHSET Y DUPLICADOS ");
        Set<RecursoHumanitario> inventarioSet = new HashSet<>();
        KitMedico kitOriginal = new KitMedico("MED-300", 95, "Jeringas");
        KitMedico kitDuplicado = new KitMedico("MED-300", 60, "JeringasDuplicadas ");

        inventarioSet.add(kitOriginal);
        inventarioSet.add(kitDuplicado); 
        
        
        System.out.println("Elementos totales en el HashSet: " + inventarioSet.size());
   
        
    }
}
