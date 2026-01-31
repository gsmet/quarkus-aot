package fr.spacefox.perftests.quarkus.rest.endpoint408;

import fr.spacefox.perftests.quarkus.core.service408.Service408;
import fr.spacefox.perftests.quarkus.rest.endpoint408.schema.Schema408;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint408")
public class Endpoint408Resource {

    private final Service408 service;

    public Endpoint408Resource(Service408 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema408 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
