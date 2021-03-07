package protocolTest;
import static org.junit.Assert.*;
 
import org.junit.Test;

import communicationProtocol.IMQProtocol;

public class IMQProtocolTest { 

	@Test
	public void test() {
		IMQProtocol protocol=new IMQProtocol(); 
		protocol.setDataFormat("JSON");
		protocol.setDestinationUrl("localhost");
		protocol.setVersion("1.0"); 
		assertEquals(protocol.getDataFormat(),"JSON");
		assertEquals(protocol.getDestinationUrl() ,"localhost");
		assertEquals(protocol.getVersion(),"1.0" );
		
	 }

}
