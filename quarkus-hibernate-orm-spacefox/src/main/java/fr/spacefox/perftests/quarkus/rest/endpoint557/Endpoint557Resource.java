package fr.spacefox.perftests.quarkus.rest.endpoint557;

import fr.spacefox.perftests.quarkus.core.service557.Service557;
import fr.spacefox.perftests.quarkus.rest.endpoint557.schema.Schema557;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint557")
public class Endpoint557Resource {

    private final Service557 service;

    public Endpoint557Resource(Service557 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema557 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
