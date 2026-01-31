package fr.spacefox.perftests.quarkus.rest.endpoint243;

import fr.spacefox.perftests.quarkus.core.service243.Service243;
import fr.spacefox.perftests.quarkus.rest.endpoint243.schema.Schema243;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint243")
public class Endpoint243Resource {

    private final Service243 service;

    public Endpoint243Resource(Service243 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema243 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
