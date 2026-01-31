package fr.spacefox.perftests.quarkus.rest.endpoint22;

import fr.spacefox.perftests.quarkus.core.service22.Service22;
import fr.spacefox.perftests.quarkus.rest.endpoint22.schema.Schema22;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint22")
public class Endpoint22Resource {

    private final Service22 service;

    public Endpoint22Resource(Service22 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema22 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
