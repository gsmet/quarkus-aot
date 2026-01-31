package fr.spacefox.perftests.quarkus.rest.endpoint929;

import fr.spacefox.perftests.quarkus.core.service929.Service929;
import fr.spacefox.perftests.quarkus.rest.endpoint929.schema.Schema929;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint929")
public class Endpoint929Resource {

    private final Service929 service;

    public Endpoint929Resource(Service929 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema929 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
