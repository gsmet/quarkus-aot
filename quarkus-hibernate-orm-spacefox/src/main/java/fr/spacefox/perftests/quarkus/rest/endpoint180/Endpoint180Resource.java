package fr.spacefox.perftests.quarkus.rest.endpoint180;

import fr.spacefox.perftests.quarkus.core.service180.Service180;
import fr.spacefox.perftests.quarkus.rest.endpoint180.schema.Schema180;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint180")
public class Endpoint180Resource {

    private final Service180 service;

    public Endpoint180Resource(Service180 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema180 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
