package fr.spacefox.perftests.quarkus.rest.endpoint664;

import fr.spacefox.perftests.quarkus.core.service664.Service664;
import fr.spacefox.perftests.quarkus.rest.endpoint664.schema.Schema664;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint664")
public class Endpoint664Resource {

    private final Service664 service;

    public Endpoint664Resource(Service664 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema664 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
