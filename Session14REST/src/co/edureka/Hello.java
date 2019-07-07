package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer; -> Configure this API in web.xml file

/*
 	Steps for RESTful Web Service Creation
 	1. Copy the jersey jars in lib directory
 	2. Create Web Service i.e. Java Class with Web Methods
 	3. Use Annotations to make class as a web service i.e. @Path, @GET, @Produces etc..
 	4. Configure API ServletContainer from Jersey in web.xml file
 	5. Test the Web Service in client 
 */

@Path("/hello")	// endpoint to our WebService
public class Hello {	// Web Service -> Can Process Different Types of Response
	
	@GET
	@Produces(MediaType.TEXT_PLAIN) // MIME
	public String sayPlainHello(){ 	// Web Method
		Date date = new Date();
		String response = "PLAIN Hello from Jersey at "+date+" !!";	// Plain Text Response
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){ 	// Web Method
		Date date = new Date();
		String response = "<html><body><h3>HTML Hello from Jersey at "+date+" !!</h3></body></html>"; // HTML Response
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){ 	// Web Method
		Date date = new Date();
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>XML Hello from Jersey at "+date+" !!</hello>"; // XML Response
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){ 	// Web Method
		Date date = new Date();
		String response = "{ 'message':'JSON Hello from Jersey', 'timeStamp': '"+date+"' }"; // JSON Response
		return response;
	}
	
	
}
