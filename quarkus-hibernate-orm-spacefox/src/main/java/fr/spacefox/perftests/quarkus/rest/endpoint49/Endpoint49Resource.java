package fr.spacefox.perftests.quarkus.rest.endpoint49;

import fr.spacefox.perftests.quarkus.core.service49.Service49;
import fr.spacefox.perftests.quarkus.rest.endpoint49.schema.Schema49;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint49")
public class Endpoint49Resource {

    private final Service49 service;

    public Endpoint49Resource(Service49 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema49 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
