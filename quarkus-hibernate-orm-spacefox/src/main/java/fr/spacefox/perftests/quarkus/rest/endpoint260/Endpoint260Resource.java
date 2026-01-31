package fr.spacefox.perftests.quarkus.rest.endpoint260;

import fr.spacefox.perftests.quarkus.core.service260.Service260;
import fr.spacefox.perftests.quarkus.rest.endpoint260.schema.Schema260;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint260")
public class Endpoint260Resource {

    private final Service260 service;

    public Endpoint260Resource(Service260 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema260 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
