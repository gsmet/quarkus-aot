package fr.spacefox.perftests.quarkus.rest.endpoint968;

import fr.spacefox.perftests.quarkus.core.service968.Service968;
import fr.spacefox.perftests.quarkus.rest.endpoint968.schema.Schema968;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint968")
public class Endpoint968Resource {

    private final Service968 service;

    public Endpoint968Resource(Service968 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema968 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
