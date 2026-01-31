package fr.spacefox.perftests.quarkus.rest.endpoint956;

import fr.spacefox.perftests.quarkus.core.service956.Service956;
import fr.spacefox.perftests.quarkus.rest.endpoint956.schema.Schema956;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint956")
public class Endpoint956Resource {

    private final Service956 service;

    public Endpoint956Resource(Service956 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema956 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
