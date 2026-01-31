package fr.spacefox.perftests.quarkus.rest.endpoint441;

import fr.spacefox.perftests.quarkus.core.service441.Service441;
import fr.spacefox.perftests.quarkus.rest.endpoint441.schema.Schema441;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint441")
public class Endpoint441Resource {

    private final Service441 service;

    public Endpoint441Resource(Service441 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema441 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
