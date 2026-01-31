package fr.spacefox.perftests.quarkus.rest.endpoint53;

import fr.spacefox.perftests.quarkus.core.service53.Service53;
import fr.spacefox.perftests.quarkus.rest.endpoint53.schema.Schema53;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint53")
public class Endpoint53Resource {

    private final Service53 service;

    public Endpoint53Resource(Service53 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema53 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
