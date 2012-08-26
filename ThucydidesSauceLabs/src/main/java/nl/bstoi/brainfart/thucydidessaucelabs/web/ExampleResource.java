package nl.bstoi.brainfart.thucydidessaucelabs.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.bstoi.brainfart.thucydidessaucelabs.web.wrapper.StringWrapper;


@Path("/")
public class ExampleResource {
	
	@GET
	@Path("/reverse/{textToReverse}")
	@Produces(MediaType.APPLICATION_JSON)
	public StringWrapper textReverse(@PathParam("textToReverse") String textToReverse){
		if(null==textToReverse||textToReverse.isEmpty()) throw new IllegalArgumentException("Text to reverse cannot be null or empty");
		String rev="";
		char[] charArray = textToReverse.toCharArray();
		for (int i=charArray.length-1;i>=0;i--)
		{
			rev=rev +charArray[i];
		}
		return new StringWrapper(rev);
	}

}
