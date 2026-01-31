package fr.spacefox.perftests.quarkus.rest.endpoint56;

import fr.spacefox.perftests.quarkus.core.service56.Service56;
import fr.spacefox.perftests.quarkus.rest.endpoint56.schema.Schema56;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint56")
public class Endpoint56Resource {

    private final Service56 service;

    public Endpoint56Resource(Service56 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema56 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
