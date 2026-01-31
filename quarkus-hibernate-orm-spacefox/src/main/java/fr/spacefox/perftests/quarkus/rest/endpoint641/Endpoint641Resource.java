package fr.spacefox.perftests.quarkus.rest.endpoint641;

import fr.spacefox.perftests.quarkus.core.service641.Service641;
import fr.spacefox.perftests.quarkus.rest.endpoint641.schema.Schema641;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint641")
public class Endpoint641Resource {

    private final Service641 service;

    public Endpoint641Resource(Service641 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema641 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
