package fr.spacefox.perftests.quarkus.rest.endpoint703;

import fr.spacefox.perftests.quarkus.core.service703.Service703;
import fr.spacefox.perftests.quarkus.rest.endpoint703.schema.Schema703;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint703")
public class Endpoint703Resource {

    private final Service703 service;

    public Endpoint703Resource(Service703 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema703 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
