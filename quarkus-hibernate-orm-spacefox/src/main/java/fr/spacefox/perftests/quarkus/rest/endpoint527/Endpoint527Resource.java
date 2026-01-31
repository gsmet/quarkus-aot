package fr.spacefox.perftests.quarkus.rest.endpoint527;

import fr.spacefox.perftests.quarkus.core.service527.Service527;
import fr.spacefox.perftests.quarkus.rest.endpoint527.schema.Schema527;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint527")
public class Endpoint527Resource {

    private final Service527 service;

    public Endpoint527Resource(Service527 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema527 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
