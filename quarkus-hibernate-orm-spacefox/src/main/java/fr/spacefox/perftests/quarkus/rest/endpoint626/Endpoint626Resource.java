package fr.spacefox.perftests.quarkus.rest.endpoint626;

import fr.spacefox.perftests.quarkus.core.service626.Service626;
import fr.spacefox.perftests.quarkus.rest.endpoint626.schema.Schema626;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint626")
public class Endpoint626Resource {

    private final Service626 service;

    public Endpoint626Resource(Service626 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema626 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
