package fr.spacefox.perftests.quarkus.rest.endpoint516;

import fr.spacefox.perftests.quarkus.core.service516.Service516;
import fr.spacefox.perftests.quarkus.rest.endpoint516.schema.Schema516;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint516")
public class Endpoint516Resource {

    private final Service516 service;

    public Endpoint516Resource(Service516 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema516 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
