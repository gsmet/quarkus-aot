package fr.spacefox.perftests.quarkus.rest.endpoint724;

import fr.spacefox.perftests.quarkus.core.service724.Service724;
import fr.spacefox.perftests.quarkus.rest.endpoint724.schema.Schema724;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint724")
public class Endpoint724Resource {

    private final Service724 service;

    public Endpoint724Resource(Service724 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema724 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
