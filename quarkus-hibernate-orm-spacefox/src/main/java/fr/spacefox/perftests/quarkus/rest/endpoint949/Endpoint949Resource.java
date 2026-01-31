package fr.spacefox.perftests.quarkus.rest.endpoint949;

import fr.spacefox.perftests.quarkus.core.service949.Service949;
import fr.spacefox.perftests.quarkus.rest.endpoint949.schema.Schema949;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint949")
public class Endpoint949Resource {

    private final Service949 service;

    public Endpoint949Resource(Service949 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema949 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
