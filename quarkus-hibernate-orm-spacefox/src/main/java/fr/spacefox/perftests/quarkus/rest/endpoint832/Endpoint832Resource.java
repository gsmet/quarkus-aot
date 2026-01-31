package fr.spacefox.perftests.quarkus.rest.endpoint832;

import fr.spacefox.perftests.quarkus.core.service832.Service832;
import fr.spacefox.perftests.quarkus.rest.endpoint832.schema.Schema832;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint832")
public class Endpoint832Resource {

    private final Service832 service;

    public Endpoint832Resource(Service832 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema832 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
