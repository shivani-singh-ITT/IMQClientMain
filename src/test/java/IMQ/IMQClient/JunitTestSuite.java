package IMQ.IMQClient;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clientTest.ClientServiceTest;
import modeltest.ClientTest;
import modeltest.JSONMessageTest;
import parsertest.CommandParserTest;
import propertiestest.PropertiesFileTest;
import protocolTest.IMQProtocolTest;
import protocolTest.IMQRequestTest;
import protocolTest.IMQResponseTest;

@RunWith(Suite.class)


@Suite.SuiteClasses({ 
   IMQProtocolTest.class,
   IMQRequestTest.class,
   IMQResponseTest.class,
   ClientServiceTest.class,  
   ClientTest.class,
   JSONMessageTest.class,
   CommandParserTest.class,
   PropertiesFileTest.class
})

public class JunitTestSuite {
 }

 


 