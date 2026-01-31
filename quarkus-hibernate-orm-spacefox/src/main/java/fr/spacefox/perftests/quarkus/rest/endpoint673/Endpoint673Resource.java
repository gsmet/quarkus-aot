package fr.spacefox.perftests.quarkus.rest.endpoint673;

import fr.spacefox.perftests.quarkus.core.service673.Service673;
import fr.spacefox.perftests.quarkus.rest.endpoint673.schema.Schema673;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint673")
public class Endpoint673Resource {

    private final Service673 service;

    public Endpoint673Resource(Service673 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema673 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
