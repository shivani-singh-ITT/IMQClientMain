package client;

import communicationProtocol.IMQRequest;
 
public class ClientService {
	public static IMQRequest getRequest(String inetAddress, String[] userCommand) {
		IMQRequest clientRequest = new IMQRequest();
		clientRequest.setDataFormat(Constants.dataFormat);
		clientRequest.setDestinationUrl(Constants.localhost);
		clientRequest.setSourceUrl(getSourceUrl(inetAddress));
		clientRequest.setVersion(Constants.version);
		clientRequest.setUserCommand(userCommand);
		return clientRequest;
	} 

	public static String getSourceUrl(String inetAddress) {
		String[] splittedUrlArray = inetAddress.split("/", 2);
		return splittedUrlArray[1];
	}

}
