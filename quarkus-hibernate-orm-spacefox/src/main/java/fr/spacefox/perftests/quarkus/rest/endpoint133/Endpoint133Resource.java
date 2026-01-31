package fr.spacefox.perftests.quarkus.rest.endpoint133;

import fr.spacefox.perftests.quarkus.core.service133.Service133;
import fr.spacefox.perftests.quarkus.rest.endpoint133.schema.Schema133;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint133")
public class Endpoint133Resource {

    private final Service133 service;

    public Endpoint133Resource(Service133 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema133 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
