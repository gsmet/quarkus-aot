package fr.spacefox.perftests.quarkus.rest.endpoint964;

import fr.spacefox.perftests.quarkus.core.service964.Service964;
import fr.spacefox.perftests.quarkus.rest.endpoint964.schema.Schema964;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint964")
public class Endpoint964Resource {

    private final Service964 service;

    public Endpoint964Resource(Service964 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema964 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
