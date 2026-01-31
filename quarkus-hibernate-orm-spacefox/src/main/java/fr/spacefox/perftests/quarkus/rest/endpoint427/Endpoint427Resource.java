package fr.spacefox.perftests.quarkus.rest.endpoint427;

import fr.spacefox.perftests.quarkus.core.service427.Service427;
import fr.spacefox.perftests.quarkus.rest.endpoint427.schema.Schema427;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint427")
public class Endpoint427Resource {

    private final Service427 service;

    public Endpoint427Resource(Service427 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema427 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
