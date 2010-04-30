package location.master.dao.test;

import junit.framework.TestCase;
import location.master.dao.Vehiculedao;
import location.master.services.Vehicule;

public class TestVehiculeDao extends TestCase {
private Vehiculedao dao = new Vehiculedao();
	
	public void testGet() {
		Vehicule row = dao.listevehicules("C18998").get(0);
		assertNotNull(row);
		assertEquals("Renaut",row.getmodele());		
	}
}
