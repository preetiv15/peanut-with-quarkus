package response;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import java.util.List;

@Path("")
public interface PeanutsClient {

	@GET
	@Path("/count")
	Integer getPeanutsCount();

	// @GET
	// @Path("/same")
	// @Produces(MediaType.TEXT_PLAIN)
    // public String hello();

	@GET
	@Path("/{id}")
	Peanut getPeanutById(@PathParam("id") String id);

}
