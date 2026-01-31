package fr.spacefox.perftests.quarkus.rest.endpoint374;

import fr.spacefox.perftests.quarkus.core.service374.Service374;
import fr.spacefox.perftests.quarkus.rest.endpoint374.schema.Schema374;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint374")
public class Endpoint374Resource {

    private final Service374 service;

    public Endpoint374Resource(Service374 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema374 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
