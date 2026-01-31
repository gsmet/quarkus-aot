package fr.spacefox.perftests.quarkus.rest.endpoint181;

import fr.spacefox.perftests.quarkus.core.service181.Service181;
import fr.spacefox.perftests.quarkus.rest.endpoint181.schema.Schema181;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint181")
public class Endpoint181Resource {

    private final Service181 service;

    public Endpoint181Resource(Service181 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema181 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
