package modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.Client;

public class ClientTest {

	@Test
	public void test() {
		Client client=new Client();
		client.setClientName("shivani");
		client.setId("1");
		assertEquals(client.getClientName(),"shivani");
		assertEquals(client.getId(),"1");
		
	}

}
