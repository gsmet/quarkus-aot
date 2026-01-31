package fr.spacefox.perftests.quarkus.rest.endpoint793;

import fr.spacefox.perftests.quarkus.core.service793.Service793;
import fr.spacefox.perftests.quarkus.rest.endpoint793.schema.Schema793;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint793")
public class Endpoint793Resource {

    private final Service793 service;

    public Endpoint793Resource(Service793 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema793 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
