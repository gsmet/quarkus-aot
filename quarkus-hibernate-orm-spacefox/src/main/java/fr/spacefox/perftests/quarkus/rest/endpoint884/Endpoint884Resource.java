package fr.spacefox.perftests.quarkus.rest.endpoint884;

import fr.spacefox.perftests.quarkus.core.service884.Service884;
import fr.spacefox.perftests.quarkus.rest.endpoint884.schema.Schema884;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint884")
public class Endpoint884Resource {

    private final Service884 service;

    public Endpoint884Resource(Service884 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema884 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
