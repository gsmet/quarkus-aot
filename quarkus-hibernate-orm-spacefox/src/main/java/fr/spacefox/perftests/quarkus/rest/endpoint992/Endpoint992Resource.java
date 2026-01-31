package fr.spacefox.perftests.quarkus.rest.endpoint992;

import fr.spacefox.perftests.quarkus.core.service992.Service992;
import fr.spacefox.perftests.quarkus.rest.endpoint992.schema.Schema992;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint992")
public class Endpoint992Resource {

    private final Service992 service;

    public Endpoint992Resource(Service992 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema992 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
