package fr.spacefox.perftests.quarkus.rest.endpoint52;

import fr.spacefox.perftests.quarkus.core.service52.Service52;
import fr.spacefox.perftests.quarkus.rest.endpoint52.schema.Schema52;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint52")
public class Endpoint52Resource {

    private final Service52 service;

    public Endpoint52Resource(Service52 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema52 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
