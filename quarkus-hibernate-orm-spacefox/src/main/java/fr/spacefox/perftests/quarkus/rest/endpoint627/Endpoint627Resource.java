package fr.spacefox.perftests.quarkus.rest.endpoint627;

import fr.spacefox.perftests.quarkus.core.service627.Service627;
import fr.spacefox.perftests.quarkus.rest.endpoint627.schema.Schema627;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint627")
public class Endpoint627Resource {

    private final Service627 service;

    public Endpoint627Resource(Service627 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema627 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
