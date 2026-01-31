package fr.spacefox.perftests.quarkus.rest.endpoint257;

import fr.spacefox.perftests.quarkus.core.service257.Service257;
import fr.spacefox.perftests.quarkus.rest.endpoint257.schema.Schema257;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint257")
public class Endpoint257Resource {

    private final Service257 service;

    public Endpoint257Resource(Service257 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema257 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
