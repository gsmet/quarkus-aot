package fr.spacefox.perftests.quarkus.rest.endpoint420;

import fr.spacefox.perftests.quarkus.core.service420.Service420;
import fr.spacefox.perftests.quarkus.rest.endpoint420.schema.Schema420;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint420")
public class Endpoint420Resource {

    private final Service420 service;

    public Endpoint420Resource(Service420 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema420 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
