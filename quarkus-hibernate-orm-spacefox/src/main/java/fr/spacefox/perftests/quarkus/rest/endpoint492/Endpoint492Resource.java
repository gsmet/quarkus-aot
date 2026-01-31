package fr.spacefox.perftests.quarkus.rest.endpoint492;

import fr.spacefox.perftests.quarkus.core.service492.Service492;
import fr.spacefox.perftests.quarkus.rest.endpoint492.schema.Schema492;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint492")
public class Endpoint492Resource {

    private final Service492 service;

    public Endpoint492Resource(Service492 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema492 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
