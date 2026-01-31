package fr.spacefox.perftests.quarkus.rest.endpoint266;

import fr.spacefox.perftests.quarkus.core.service266.Service266;
import fr.spacefox.perftests.quarkus.rest.endpoint266.schema.Schema266;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint266")
public class Endpoint266Resource {

    private final Service266 service;

    public Endpoint266Resource(Service266 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema266 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
