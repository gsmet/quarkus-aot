package fr.spacefox.perftests.quarkus.rest.endpoint660;

import fr.spacefox.perftests.quarkus.core.service660.Service660;
import fr.spacefox.perftests.quarkus.rest.endpoint660.schema.Schema660;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint660")
public class Endpoint660Resource {

    private final Service660 service;

    public Endpoint660Resource(Service660 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema660 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
