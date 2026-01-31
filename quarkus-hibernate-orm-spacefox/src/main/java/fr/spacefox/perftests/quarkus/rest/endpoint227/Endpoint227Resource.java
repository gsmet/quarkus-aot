package fr.spacefox.perftests.quarkus.rest.endpoint227;

import fr.spacefox.perftests.quarkus.core.service227.Service227;
import fr.spacefox.perftests.quarkus.rest.endpoint227.schema.Schema227;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint227")
public class Endpoint227Resource {

    private final Service227 service;

    public Endpoint227Resource(Service227 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema227 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
