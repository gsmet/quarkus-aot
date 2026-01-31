package fr.spacefox.perftests.quarkus.rest.endpoint862;

import fr.spacefox.perftests.quarkus.core.service862.Service862;
import fr.spacefox.perftests.quarkus.rest.endpoint862.schema.Schema862;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint862")
public class Endpoint862Resource {

    private final Service862 service;

    public Endpoint862Resource(Service862 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema862 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
