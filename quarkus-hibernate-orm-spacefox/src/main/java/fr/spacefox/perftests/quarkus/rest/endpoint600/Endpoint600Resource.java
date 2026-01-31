package fr.spacefox.perftests.quarkus.rest.endpoint600;

import fr.spacefox.perftests.quarkus.core.service600.Service600;
import fr.spacefox.perftests.quarkus.rest.endpoint600.schema.Schema600;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint600")
public class Endpoint600Resource {

    private final Service600 service;

    public Endpoint600Resource(Service600 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema600 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
