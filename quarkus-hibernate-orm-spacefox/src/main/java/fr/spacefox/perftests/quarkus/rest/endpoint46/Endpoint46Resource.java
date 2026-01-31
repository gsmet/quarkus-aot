package fr.spacefox.perftests.quarkus.rest.endpoint46;

import fr.spacefox.perftests.quarkus.core.service46.Service46;
import fr.spacefox.perftests.quarkus.rest.endpoint46.schema.Schema46;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint46")
public class Endpoint46Resource {

    private final Service46 service;

    public Endpoint46Resource(Service46 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema46 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
