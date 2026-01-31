package fr.spacefox.perftests.quarkus.rest.endpoint750;

import fr.spacefox.perftests.quarkus.core.service750.Service750;
import fr.spacefox.perftests.quarkus.rest.endpoint750.schema.Schema750;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint750")
public class Endpoint750Resource {

    private final Service750 service;

    public Endpoint750Resource(Service750 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema750 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
