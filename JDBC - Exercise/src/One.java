package One;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class One {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		CRUD crud = new CRUD();
		
		// Select all	
		System.out.println("Original Table");
		List<Agency> list = new ArrayList<>();
		
		list = crud.findAll();
		
		System.out.println(list.toString());
		
		// Insert new
		System.out.println("\n\nNew row");
		Agency newAgency = crud.createAgency("Nissan Toluca", 49000, "nissantoluca@contacto.com");
		if(newAgency != null) {
			list.add(newAgency);
			System.out.println(newAgency.toString());
		}else {
			System.out.println("The INSERT failed");
		}
		
		// UPDATE
		System.out.println("\n\nUpdate row");
		Agency updateAgency = crud.update(4,"Nissan Toluca", 49001, "nissan_toluca@contacto.com");
		
		if(updateAgency != null) {
			list.remove(3);
			list.add(updateAgency);
			System.out.println(updateAgency.toString());
		}else {
			System.out.println("The UPDATE failed");
		}
		
		//Final
		System.out.println("\n\nPre-final Table");
		list = crud.findAll();
		System.out.println(list.toString());
		
		// DELETE
		System.out.println("\n\nFinal Table");
		crud.deletePerson(5);
		list = crud.findAll();
		System.out.println(list.toString());
		
		
	}

}
