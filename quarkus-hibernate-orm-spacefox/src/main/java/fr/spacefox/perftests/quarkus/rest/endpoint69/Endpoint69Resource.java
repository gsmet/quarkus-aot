package fr.spacefox.perftests.quarkus.rest.endpoint69;

import fr.spacefox.perftests.quarkus.core.service69.Service69;
import fr.spacefox.perftests.quarkus.rest.endpoint69.schema.Schema69;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint69")
public class Endpoint69Resource {

    private final Service69 service;

    public Endpoint69Resource(Service69 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema69 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
