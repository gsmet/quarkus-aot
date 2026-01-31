package fr.spacefox.perftests.quarkus.rest.endpoint33;

import fr.spacefox.perftests.quarkus.core.service33.Service33;
import fr.spacefox.perftests.quarkus.rest.endpoint33.schema.Schema33;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint33")
public class Endpoint33Resource {

    private final Service33 service;

    public Endpoint33Resource(Service33 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema33 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
