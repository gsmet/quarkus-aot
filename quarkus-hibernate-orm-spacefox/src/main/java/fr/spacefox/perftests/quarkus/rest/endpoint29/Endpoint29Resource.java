package fr.spacefox.perftests.quarkus.rest.endpoint29;

import fr.spacefox.perftests.quarkus.core.service29.Service29;
import fr.spacefox.perftests.quarkus.rest.endpoint29.schema.Schema29;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint29")
public class Endpoint29Resource {

    private final Service29 service;

    public Endpoint29Resource(Service29 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema29 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
