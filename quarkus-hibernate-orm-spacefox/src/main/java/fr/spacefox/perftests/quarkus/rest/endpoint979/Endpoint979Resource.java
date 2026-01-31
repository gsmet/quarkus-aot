package fr.spacefox.perftests.quarkus.rest.endpoint979;

import fr.spacefox.perftests.quarkus.core.service979.Service979;
import fr.spacefox.perftests.quarkus.rest.endpoint979.schema.Schema979;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint979")
public class Endpoint979Resource {

    private final Service979 service;

    public Endpoint979Resource(Service979 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema979 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
