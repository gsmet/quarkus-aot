package fr.spacefox.perftests.quarkus.rest.endpoint868;

import fr.spacefox.perftests.quarkus.core.service868.Service868;
import fr.spacefox.perftests.quarkus.rest.endpoint868.schema.Schema868;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint868")
public class Endpoint868Resource {

    private final Service868 service;

    public Endpoint868Resource(Service868 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema868 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
