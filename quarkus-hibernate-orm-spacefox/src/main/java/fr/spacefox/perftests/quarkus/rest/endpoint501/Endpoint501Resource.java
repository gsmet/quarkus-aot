package fr.spacefox.perftests.quarkus.rest.endpoint501;

import fr.spacefox.perftests.quarkus.core.service501.Service501;
import fr.spacefox.perftests.quarkus.rest.endpoint501.schema.Schema501;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint501")
public class Endpoint501Resource {

    private final Service501 service;

    public Endpoint501Resource(Service501 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema501 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
