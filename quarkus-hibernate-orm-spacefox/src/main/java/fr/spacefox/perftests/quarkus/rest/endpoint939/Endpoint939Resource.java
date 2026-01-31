package fr.spacefox.perftests.quarkus.rest.endpoint939;

import fr.spacefox.perftests.quarkus.core.service939.Service939;
import fr.spacefox.perftests.quarkus.rest.endpoint939.schema.Schema939;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint939")
public class Endpoint939Resource {

    private final Service939 service;

    public Endpoint939Resource(Service939 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema939 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
