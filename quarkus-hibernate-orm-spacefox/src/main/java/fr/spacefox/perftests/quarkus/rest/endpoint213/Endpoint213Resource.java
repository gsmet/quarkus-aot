package fr.spacefox.perftests.quarkus.rest.endpoint213;

import fr.spacefox.perftests.quarkus.core.service213.Service213;
import fr.spacefox.perftests.quarkus.rest.endpoint213.schema.Schema213;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint213")
public class Endpoint213Resource {

    private final Service213 service;

    public Endpoint213Resource(Service213 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema213 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
