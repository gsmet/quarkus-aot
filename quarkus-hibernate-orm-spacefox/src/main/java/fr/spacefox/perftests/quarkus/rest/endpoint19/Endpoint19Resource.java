package fr.spacefox.perftests.quarkus.rest.endpoint19;

import fr.spacefox.perftests.quarkus.core.service19.Service19;
import fr.spacefox.perftests.quarkus.rest.endpoint19.schema.Schema19;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint19")
public class Endpoint19Resource {

    private final Service19 service;

    public Endpoint19Resource(Service19 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema19 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
