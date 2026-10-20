package quiz2_MJ;

import java.util.ArrayList;
import java.util.List;

public class Master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegistroAyudas<KitMedico> LK1 = new RegistroAyudas<>();
		 KitMedico k1 = new KitMedico("MED-101" , 85 , "dolex");
		 KitMedico k2 = new KitMedico("MED-102" , 69 , "condon");
		
		 LK1.agregar(k1);
		 LK1.agregar(k2);
		 
		 System.out.println("cantidad en registro : " + LK1.cantidad() );
	}

}
