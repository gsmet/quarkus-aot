package fr.spacefox.perftests.quarkus.rest.endpoint876;

import fr.spacefox.perftests.quarkus.core.service876.Service876;
import fr.spacefox.perftests.quarkus.rest.endpoint876.schema.Schema876;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint876")
public class Endpoint876Resource {

    private final Service876 service;

    public Endpoint876Resource(Service876 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema876 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
