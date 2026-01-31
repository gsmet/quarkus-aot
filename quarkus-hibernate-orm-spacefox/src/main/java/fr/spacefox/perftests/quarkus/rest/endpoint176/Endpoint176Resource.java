package fr.spacefox.perftests.quarkus.rest.endpoint176;

import fr.spacefox.perftests.quarkus.core.service176.Service176;
import fr.spacefox.perftests.quarkus.rest.endpoint176.schema.Schema176;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint176")
public class Endpoint176Resource {

    private final Service176 service;

    public Endpoint176Resource(Service176 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema176 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
