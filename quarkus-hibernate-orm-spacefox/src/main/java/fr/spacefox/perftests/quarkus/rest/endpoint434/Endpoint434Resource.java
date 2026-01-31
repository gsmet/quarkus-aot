package fr.spacefox.perftests.quarkus.rest.endpoint434;

import fr.spacefox.perftests.quarkus.core.service434.Service434;
import fr.spacefox.perftests.quarkus.rest.endpoint434.schema.Schema434;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint434")
public class Endpoint434Resource {

    private final Service434 service;

    public Endpoint434Resource(Service434 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema434 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
