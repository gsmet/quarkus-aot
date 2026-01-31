package fr.spacefox.perftests.quarkus.rest.endpoint379;

import fr.spacefox.perftests.quarkus.core.service379.Service379;
import fr.spacefox.perftests.quarkus.rest.endpoint379.schema.Schema379;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint379")
public class Endpoint379Resource {

    private final Service379 service;

    public Endpoint379Resource(Service379 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema379 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
