package fr.spacefox.perftests.quarkus.rest.endpoint637;

import fr.spacefox.perftests.quarkus.core.service637.Service637;
import fr.spacefox.perftests.quarkus.rest.endpoint637.schema.Schema637;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint637")
public class Endpoint637Resource {

    private final Service637 service;

    public Endpoint637Resource(Service637 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema637 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
