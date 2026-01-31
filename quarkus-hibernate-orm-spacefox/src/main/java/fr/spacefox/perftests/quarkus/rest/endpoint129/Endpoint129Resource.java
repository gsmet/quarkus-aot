package fr.spacefox.perftests.quarkus.rest.endpoint129;

import fr.spacefox.perftests.quarkus.core.service129.Service129;
import fr.spacefox.perftests.quarkus.rest.endpoint129.schema.Schema129;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint129")
public class Endpoint129Resource {

    private final Service129 service;

    public Endpoint129Resource(Service129 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema129 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
