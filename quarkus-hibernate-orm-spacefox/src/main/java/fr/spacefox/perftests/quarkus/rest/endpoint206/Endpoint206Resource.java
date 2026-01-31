package fr.spacefox.perftests.quarkus.rest.endpoint206;

import fr.spacefox.perftests.quarkus.core.service206.Service206;
import fr.spacefox.perftests.quarkus.rest.endpoint206.schema.Schema206;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint206")
public class Endpoint206Resource {

    private final Service206 service;

    public Endpoint206Resource(Service206 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema206 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
