package fr.spacefox.perftests.quarkus.rest.endpoint972;

import fr.spacefox.perftests.quarkus.core.service972.Service972;
import fr.spacefox.perftests.quarkus.rest.endpoint972.schema.Schema972;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint972")
public class Endpoint972Resource {

    private final Service972 service;

    public Endpoint972Resource(Service972 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema972 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
