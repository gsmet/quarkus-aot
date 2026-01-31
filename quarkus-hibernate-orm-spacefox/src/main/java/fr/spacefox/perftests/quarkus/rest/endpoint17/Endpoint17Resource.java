package fr.spacefox.perftests.quarkus.rest.endpoint17;

import fr.spacefox.perftests.quarkus.core.service17.Service17;
import fr.spacefox.perftests.quarkus.rest.endpoint17.schema.Schema17;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint17")
public class Endpoint17Resource {

    private final Service17 service;

    public Endpoint17Resource(Service17 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema17 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
