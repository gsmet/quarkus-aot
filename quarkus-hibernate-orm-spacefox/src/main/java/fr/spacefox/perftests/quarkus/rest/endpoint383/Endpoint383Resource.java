package fr.spacefox.perftests.quarkus.rest.endpoint383;

import fr.spacefox.perftests.quarkus.core.service383.Service383;
import fr.spacefox.perftests.quarkus.rest.endpoint383.schema.Schema383;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint383")
public class Endpoint383Resource {

    private final Service383 service;

    public Endpoint383Resource(Service383 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema383 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
