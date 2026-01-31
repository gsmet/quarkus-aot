package fr.spacefox.perftests.quarkus.rest.endpoint66;

import fr.spacefox.perftests.quarkus.core.service66.Service66;
import fr.spacefox.perftests.quarkus.rest.endpoint66.schema.Schema66;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint66")
public class Endpoint66Resource {

    private final Service66 service;

    public Endpoint66Resource(Service66 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema66 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
