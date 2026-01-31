package fr.spacefox.perftests.quarkus.rest.endpoint137;

import fr.spacefox.perftests.quarkus.core.service137.Service137;
import fr.spacefox.perftests.quarkus.rest.endpoint137.schema.Schema137;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint137")
public class Endpoint137Resource {

    private final Service137 service;

    public Endpoint137Resource(Service137 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema137 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
