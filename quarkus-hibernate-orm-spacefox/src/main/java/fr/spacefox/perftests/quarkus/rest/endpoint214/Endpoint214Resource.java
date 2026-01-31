package fr.spacefox.perftests.quarkus.rest.endpoint214;

import fr.spacefox.perftests.quarkus.core.service214.Service214;
import fr.spacefox.perftests.quarkus.rest.endpoint214.schema.Schema214;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint214")
public class Endpoint214Resource {

    private final Service214 service;

    public Endpoint214Resource(Service214 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema214 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
