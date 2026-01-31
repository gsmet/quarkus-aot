package fr.spacefox.perftests.quarkus.rest.endpoint520;

import fr.spacefox.perftests.quarkus.core.service520.Service520;
import fr.spacefox.perftests.quarkus.rest.endpoint520.schema.Schema520;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint520")
public class Endpoint520Resource {

    private final Service520 service;

    public Endpoint520Resource(Service520 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema520 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
