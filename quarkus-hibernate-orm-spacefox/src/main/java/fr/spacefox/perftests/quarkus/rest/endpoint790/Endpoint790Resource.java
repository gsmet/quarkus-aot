package fr.spacefox.perftests.quarkus.rest.endpoint790;

import fr.spacefox.perftests.quarkus.core.service790.Service790;
import fr.spacefox.perftests.quarkus.rest.endpoint790.schema.Schema790;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint790")
public class Endpoint790Resource {

    private final Service790 service;

    public Endpoint790Resource(Service790 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema790 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
