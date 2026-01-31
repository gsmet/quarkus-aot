package fr.spacefox.perftests.quarkus.rest.endpoint348;

import fr.spacefox.perftests.quarkus.core.service348.Service348;
import fr.spacefox.perftests.quarkus.rest.endpoint348.schema.Schema348;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint348")
public class Endpoint348Resource {

    private final Service348 service;

    public Endpoint348Resource(Service348 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema348 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
