package fr.spacefox.perftests.quarkus.rest.endpoint910;

import fr.spacefox.perftests.quarkus.core.service910.Service910;
import fr.spacefox.perftests.quarkus.rest.endpoint910.schema.Schema910;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint910")
public class Endpoint910Resource {

    private final Service910 service;

    public Endpoint910Resource(Service910 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema910 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
