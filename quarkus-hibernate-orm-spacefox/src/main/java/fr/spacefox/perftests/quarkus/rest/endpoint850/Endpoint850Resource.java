package fr.spacefox.perftests.quarkus.rest.endpoint850;

import fr.spacefox.perftests.quarkus.core.service850.Service850;
import fr.spacefox.perftests.quarkus.rest.endpoint850.schema.Schema850;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint850")
public class Endpoint850Resource {

    private final Service850 service;

    public Endpoint850Resource(Service850 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema850 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
