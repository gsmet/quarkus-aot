package fr.spacefox.perftests.quarkus.rest.endpoint644;

import fr.spacefox.perftests.quarkus.core.service644.Service644;
import fr.spacefox.perftests.quarkus.rest.endpoint644.schema.Schema644;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint644")
public class Endpoint644Resource {

    private final Service644 service;

    public Endpoint644Resource(Service644 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema644 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
