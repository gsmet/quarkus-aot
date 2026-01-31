package fr.spacefox.perftests.quarkus.rest.endpoint563;

import fr.spacefox.perftests.quarkus.core.service563.Service563;
import fr.spacefox.perftests.quarkus.rest.endpoint563.schema.Schema563;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint563")
public class Endpoint563Resource {

    private final Service563 service;

    public Endpoint563Resource(Service563 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema563 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
