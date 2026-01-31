package fr.spacefox.perftests.quarkus.rest.endpoint734;

import fr.spacefox.perftests.quarkus.core.service734.Service734;
import fr.spacefox.perftests.quarkus.rest.endpoint734.schema.Schema734;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint734")
public class Endpoint734Resource {

    private final Service734 service;

    public Endpoint734Resource(Service734 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema734 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
