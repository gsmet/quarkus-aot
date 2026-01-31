package fr.spacefox.perftests.quarkus.rest.endpoint70;

import fr.spacefox.perftests.quarkus.core.service70.Service70;
import fr.spacefox.perftests.quarkus.rest.endpoint70.schema.Schema70;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint70")
public class Endpoint70Resource {

    private final Service70 service;

    public Endpoint70Resource(Service70 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema70 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
