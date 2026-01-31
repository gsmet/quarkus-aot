package fr.spacefox.perftests.quarkus.rest.endpoint989;

import fr.spacefox.perftests.quarkus.core.service989.Service989;
import fr.spacefox.perftests.quarkus.rest.endpoint989.schema.Schema989;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint989")
public class Endpoint989Resource {

    private final Service989 service;

    public Endpoint989Resource(Service989 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema989 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
