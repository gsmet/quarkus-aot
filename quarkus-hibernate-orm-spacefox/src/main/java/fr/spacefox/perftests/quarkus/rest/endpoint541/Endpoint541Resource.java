package fr.spacefox.perftests.quarkus.rest.endpoint541;

import fr.spacefox.perftests.quarkus.core.service541.Service541;
import fr.spacefox.perftests.quarkus.rest.endpoint541.schema.Schema541;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint541")
public class Endpoint541Resource {

    private final Service541 service;

    public Endpoint541Resource(Service541 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema541 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
