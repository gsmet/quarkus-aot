package fr.spacefox.perftests.quarkus.rest.endpoint678;

import fr.spacefox.perftests.quarkus.core.service678.Service678;
import fr.spacefox.perftests.quarkus.rest.endpoint678.schema.Schema678;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint678")
public class Endpoint678Resource {

    private final Service678 service;

    public Endpoint678Resource(Service678 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema678 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
