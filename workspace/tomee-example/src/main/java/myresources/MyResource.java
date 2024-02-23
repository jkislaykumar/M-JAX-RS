package myresources;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

@Path("customers")
public class MyResource {

	@GET 
	@Path("{id}")
	public String getOne(@PathParam("id") String id, @Context ServletContext config) {
		String mcp = config.getInitParameter("MyContextParam");
		String msg = "This is the cusomer with id " + id
				+ " and my context param is " + mcp;
		return msg;
	
	}
}
