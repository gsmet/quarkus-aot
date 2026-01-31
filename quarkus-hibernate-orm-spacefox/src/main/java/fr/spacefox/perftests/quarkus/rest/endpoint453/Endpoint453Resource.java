package fr.spacefox.perftests.quarkus.rest.endpoint453;

import fr.spacefox.perftests.quarkus.core.service453.Service453;
import fr.spacefox.perftests.quarkus.rest.endpoint453.schema.Schema453;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint453")
public class Endpoint453Resource {

    private final Service453 service;

    public Endpoint453Resource(Service453 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema453 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
