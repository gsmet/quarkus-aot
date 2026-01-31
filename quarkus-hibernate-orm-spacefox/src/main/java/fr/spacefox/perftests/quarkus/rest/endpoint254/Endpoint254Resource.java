package fr.spacefox.perftests.quarkus.rest.endpoint254;

import fr.spacefox.perftests.quarkus.core.service254.Service254;
import fr.spacefox.perftests.quarkus.rest.endpoint254.schema.Schema254;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint254")
public class Endpoint254Resource {

    private final Service254 service;

    public Endpoint254Resource(Service254 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema254 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
