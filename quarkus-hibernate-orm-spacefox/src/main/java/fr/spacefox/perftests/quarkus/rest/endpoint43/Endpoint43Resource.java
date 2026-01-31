package fr.spacefox.perftests.quarkus.rest.endpoint43;

import fr.spacefox.perftests.quarkus.core.service43.Service43;
import fr.spacefox.perftests.quarkus.rest.endpoint43.schema.Schema43;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint43")
public class Endpoint43Resource {

    private final Service43 service;

    public Endpoint43Resource(Service43 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema43 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
