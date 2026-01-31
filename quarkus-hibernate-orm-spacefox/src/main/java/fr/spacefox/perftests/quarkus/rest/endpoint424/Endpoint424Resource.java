package fr.spacefox.perftests.quarkus.rest.endpoint424;

import fr.spacefox.perftests.quarkus.core.service424.Service424;
import fr.spacefox.perftests.quarkus.rest.endpoint424.schema.Schema424;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint424")
public class Endpoint424Resource {

    private final Service424 service;

    public Endpoint424Resource(Service424 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema424 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
