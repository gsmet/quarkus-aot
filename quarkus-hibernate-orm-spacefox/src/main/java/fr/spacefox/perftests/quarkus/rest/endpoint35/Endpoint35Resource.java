package fr.spacefox.perftests.quarkus.rest.endpoint35;

import fr.spacefox.perftests.quarkus.core.service35.Service35;
import fr.spacefox.perftests.quarkus.rest.endpoint35.schema.Schema35;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint35")
public class Endpoint35Resource {

    private final Service35 service;

    public Endpoint35Resource(Service35 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema35 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
