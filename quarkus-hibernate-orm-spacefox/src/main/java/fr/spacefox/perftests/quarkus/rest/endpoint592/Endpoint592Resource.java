package fr.spacefox.perftests.quarkus.rest.endpoint592;

import fr.spacefox.perftests.quarkus.core.service592.Service592;
import fr.spacefox.perftests.quarkus.rest.endpoint592.schema.Schema592;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint592")
public class Endpoint592Resource {

    private final Service592 service;

    public Endpoint592Resource(Service592 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema592 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
