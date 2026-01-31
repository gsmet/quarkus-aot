package fr.spacefox.perftests.quarkus.rest.endpoint842;

import fr.spacefox.perftests.quarkus.core.service842.Service842;
import fr.spacefox.perftests.quarkus.rest.endpoint842.schema.Schema842;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint842")
public class Endpoint842Resource {

    private final Service842 service;

    public Endpoint842Resource(Service842 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema842 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
