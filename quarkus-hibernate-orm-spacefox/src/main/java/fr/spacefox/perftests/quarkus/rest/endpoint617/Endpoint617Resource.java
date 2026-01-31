package fr.spacefox.perftests.quarkus.rest.endpoint617;

import fr.spacefox.perftests.quarkus.core.service617.Service617;
import fr.spacefox.perftests.quarkus.rest.endpoint617.schema.Schema617;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint617")
public class Endpoint617Resource {

    private final Service617 service;

    public Endpoint617Resource(Service617 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema617 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
