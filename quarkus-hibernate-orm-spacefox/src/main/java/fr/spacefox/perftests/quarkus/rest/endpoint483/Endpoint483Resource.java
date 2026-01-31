package fr.spacefox.perftests.quarkus.rest.endpoint483;

import fr.spacefox.perftests.quarkus.core.service483.Service483;
import fr.spacefox.perftests.quarkus.rest.endpoint483.schema.Schema483;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint483")
public class Endpoint483Resource {

    private final Service483 service;

    public Endpoint483Resource(Service483 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema483 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
