package fr.spacefox.perftests.quarkus.rest.endpoint45;

import fr.spacefox.perftests.quarkus.core.service45.Service45;
import fr.spacefox.perftests.quarkus.rest.endpoint45.schema.Schema45;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint45")
public class Endpoint45Resource {

    private final Service45 service;

    public Endpoint45Resource(Service45 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema45 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
