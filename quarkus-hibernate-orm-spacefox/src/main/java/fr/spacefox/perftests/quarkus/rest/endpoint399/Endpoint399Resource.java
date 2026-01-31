package fr.spacefox.perftests.quarkus.rest.endpoint399;

import fr.spacefox.perftests.quarkus.core.service399.Service399;
import fr.spacefox.perftests.quarkus.rest.endpoint399.schema.Schema399;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint399")
public class Endpoint399Resource {

    private final Service399 service;

    public Endpoint399Resource(Service399 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema399 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
