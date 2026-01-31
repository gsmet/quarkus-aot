package fr.spacefox.perftests.quarkus.rest.endpoint120;

import fr.spacefox.perftests.quarkus.core.service120.Service120;
import fr.spacefox.perftests.quarkus.rest.endpoint120.schema.Schema120;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint120")
public class Endpoint120Resource {

    private final Service120 service;

    public Endpoint120Resource(Service120 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema120 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
