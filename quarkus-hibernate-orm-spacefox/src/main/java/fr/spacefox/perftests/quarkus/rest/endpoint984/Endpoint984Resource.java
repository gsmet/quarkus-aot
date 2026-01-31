package fr.spacefox.perftests.quarkus.rest.endpoint984;

import fr.spacefox.perftests.quarkus.core.service984.Service984;
import fr.spacefox.perftests.quarkus.rest.endpoint984.schema.Schema984;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint984")
public class Endpoint984Resource {

    private final Service984 service;

    public Endpoint984Resource(Service984 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema984 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
