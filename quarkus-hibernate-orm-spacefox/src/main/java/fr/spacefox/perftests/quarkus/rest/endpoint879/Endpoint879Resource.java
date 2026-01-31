package fr.spacefox.perftests.quarkus.rest.endpoint879;

import fr.spacefox.perftests.quarkus.core.service879.Service879;
import fr.spacefox.perftests.quarkus.rest.endpoint879.schema.Schema879;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint879")
public class Endpoint879Resource {

    private final Service879 service;

    public Endpoint879Resource(Service879 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema879 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
