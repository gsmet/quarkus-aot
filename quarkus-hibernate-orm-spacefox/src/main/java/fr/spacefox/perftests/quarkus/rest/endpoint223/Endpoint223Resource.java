package fr.spacefox.perftests.quarkus.rest.endpoint223;

import fr.spacefox.perftests.quarkus.core.service223.Service223;
import fr.spacefox.perftests.quarkus.rest.endpoint223.schema.Schema223;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint223")
public class Endpoint223Resource {

    private final Service223 service;

    public Endpoint223Resource(Service223 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema223 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
