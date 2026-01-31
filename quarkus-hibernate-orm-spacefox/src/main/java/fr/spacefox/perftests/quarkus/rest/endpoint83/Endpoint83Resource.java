package fr.spacefox.perftests.quarkus.rest.endpoint83;

import fr.spacefox.perftests.quarkus.core.service83.Service83;
import fr.spacefox.perftests.quarkus.rest.endpoint83.schema.Schema83;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint83")
public class Endpoint83Resource {

    private final Service83 service;

    public Endpoint83Resource(Service83 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema83 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
