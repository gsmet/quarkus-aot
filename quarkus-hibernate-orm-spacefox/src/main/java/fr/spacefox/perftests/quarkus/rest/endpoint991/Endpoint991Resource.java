package fr.spacefox.perftests.quarkus.rest.endpoint991;

import fr.spacefox.perftests.quarkus.core.service991.Service991;
import fr.spacefox.perftests.quarkus.rest.endpoint991.schema.Schema991;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint991")
public class Endpoint991Resource {

    private final Service991 service;

    public Endpoint991Resource(Service991 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema991 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
