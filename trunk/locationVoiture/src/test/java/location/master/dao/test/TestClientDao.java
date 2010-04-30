package location.master.dao.test;

import junit.framework.TestCase;
import location.master.dao.Clientdao;
import location.master.services.Client;

public class TestClientDao extends TestCase {
	private Clientdao dao = new Clientdao();
	
	public void testGet() {
		Client row = dao.clients("D8866").get(0);
		assertNotNull(row);
		assertEquals("Rachid",row.getprenom());		
	}
}
