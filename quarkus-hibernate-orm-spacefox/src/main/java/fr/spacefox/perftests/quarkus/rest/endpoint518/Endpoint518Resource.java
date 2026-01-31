package fr.spacefox.perftests.quarkus.rest.endpoint518;

import fr.spacefox.perftests.quarkus.core.service518.Service518;
import fr.spacefox.perftests.quarkus.rest.endpoint518.schema.Schema518;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint518")
public class Endpoint518Resource {

    private final Service518 service;

    public Endpoint518Resource(Service518 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema518 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
