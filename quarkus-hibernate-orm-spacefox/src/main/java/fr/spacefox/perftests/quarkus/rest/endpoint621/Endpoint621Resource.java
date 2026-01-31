package fr.spacefox.perftests.quarkus.rest.endpoint621;

import fr.spacefox.perftests.quarkus.core.service621.Service621;
import fr.spacefox.perftests.quarkus.rest.endpoint621.schema.Schema621;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint621")
public class Endpoint621Resource {

    private final Service621 service;

    public Endpoint621Resource(Service621 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema621 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
