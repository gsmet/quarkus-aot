package fr.spacefox.perftests.quarkus.rest.endpoint935;

import fr.spacefox.perftests.quarkus.core.service935.Service935;
import fr.spacefox.perftests.quarkus.rest.endpoint935.schema.Schema935;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint935")
public class Endpoint935Resource {

    private final Service935 service;

    public Endpoint935Resource(Service935 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema935 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
