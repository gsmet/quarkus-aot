package fr.spacefox.perftests.quarkus.rest.endpoint712;

import fr.spacefox.perftests.quarkus.core.service712.Service712;
import fr.spacefox.perftests.quarkus.rest.endpoint712.schema.Schema712;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint712")
public class Endpoint712Resource {

    private final Service712 service;

    public Endpoint712Resource(Service712 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema712 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
