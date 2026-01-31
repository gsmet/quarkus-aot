package fr.spacefox.perftests.quarkus.rest.endpoint684;

import fr.spacefox.perftests.quarkus.core.service684.Service684;
import fr.spacefox.perftests.quarkus.rest.endpoint684.schema.Schema684;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint684")
public class Endpoint684Resource {

    private final Service684 service;

    public Endpoint684Resource(Service684 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema684 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
