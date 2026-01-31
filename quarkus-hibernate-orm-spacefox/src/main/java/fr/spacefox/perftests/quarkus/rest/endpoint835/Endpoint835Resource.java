package fr.spacefox.perftests.quarkus.rest.endpoint835;

import fr.spacefox.perftests.quarkus.core.service835.Service835;
import fr.spacefox.perftests.quarkus.rest.endpoint835.schema.Schema835;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint835")
public class Endpoint835Resource {

    private final Service835 service;

    public Endpoint835Resource(Service835 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema835 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
