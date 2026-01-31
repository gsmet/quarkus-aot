package fr.spacefox.perftests.quarkus.rest.endpoint278;

import fr.spacefox.perftests.quarkus.core.service278.Service278;
import fr.spacefox.perftests.quarkus.rest.endpoint278.schema.Schema278;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint278")
public class Endpoint278Resource {

    private final Service278 service;

    public Endpoint278Resource(Service278 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema278 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
