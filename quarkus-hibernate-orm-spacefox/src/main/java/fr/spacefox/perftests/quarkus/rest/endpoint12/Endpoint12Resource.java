package fr.spacefox.perftests.quarkus.rest.endpoint12;

import fr.spacefox.perftests.quarkus.core.service12.Service12;
import fr.spacefox.perftests.quarkus.rest.endpoint12.schema.Schema12;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint12")
public class Endpoint12Resource {

    private final Service12 service;

    public Endpoint12Resource(Service12 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema12 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
