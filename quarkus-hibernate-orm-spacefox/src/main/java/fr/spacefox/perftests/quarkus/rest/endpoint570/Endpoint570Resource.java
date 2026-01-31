package fr.spacefox.perftests.quarkus.rest.endpoint570;

import fr.spacefox.perftests.quarkus.core.service570.Service570;
import fr.spacefox.perftests.quarkus.rest.endpoint570.schema.Schema570;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint570")
public class Endpoint570Resource {

    private final Service570 service;

    public Endpoint570Resource(Service570 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema570 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
