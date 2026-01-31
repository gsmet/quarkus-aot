package fr.spacefox.perftests.quarkus.rest.endpoint863;

import fr.spacefox.perftests.quarkus.core.service863.Service863;
import fr.spacefox.perftests.quarkus.rest.endpoint863.schema.Schema863;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint863")
public class Endpoint863Resource {

    private final Service863 service;

    public Endpoint863Resource(Service863 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema863 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
