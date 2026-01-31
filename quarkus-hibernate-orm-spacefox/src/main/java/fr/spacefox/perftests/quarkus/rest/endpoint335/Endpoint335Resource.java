package fr.spacefox.perftests.quarkus.rest.endpoint335;

import fr.spacefox.perftests.quarkus.core.service335.Service335;
import fr.spacefox.perftests.quarkus.rest.endpoint335.schema.Schema335;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint335")
public class Endpoint335Resource {

    private final Service335 service;

    public Endpoint335Resource(Service335 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema335 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
