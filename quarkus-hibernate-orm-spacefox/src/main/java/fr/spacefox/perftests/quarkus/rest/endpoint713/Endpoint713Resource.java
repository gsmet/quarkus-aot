package fr.spacefox.perftests.quarkus.rest.endpoint713;

import fr.spacefox.perftests.quarkus.core.service713.Service713;
import fr.spacefox.perftests.quarkus.rest.endpoint713.schema.Schema713;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint713")
public class Endpoint713Resource {

    private final Service713 service;

    public Endpoint713Resource(Service713 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema713 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
