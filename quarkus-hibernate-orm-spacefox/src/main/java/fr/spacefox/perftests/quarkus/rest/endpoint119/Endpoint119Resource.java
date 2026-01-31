package fr.spacefox.perftests.quarkus.rest.endpoint119;

import fr.spacefox.perftests.quarkus.core.service119.Service119;
import fr.spacefox.perftests.quarkus.rest.endpoint119.schema.Schema119;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint119")
public class Endpoint119Resource {

    private final Service119 service;

    public Endpoint119Resource(Service119 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema119 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
