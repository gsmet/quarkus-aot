package fr.spacefox.perftests.quarkus.rest.endpoint725;

import fr.spacefox.perftests.quarkus.core.service725.Service725;
import fr.spacefox.perftests.quarkus.rest.endpoint725.schema.Schema725;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint725")
public class Endpoint725Resource {

    private final Service725 service;

    public Endpoint725Resource(Service725 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema725 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
