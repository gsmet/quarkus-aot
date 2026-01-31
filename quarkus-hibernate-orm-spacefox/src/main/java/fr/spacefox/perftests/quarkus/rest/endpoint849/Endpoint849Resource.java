package fr.spacefox.perftests.quarkus.rest.endpoint849;

import fr.spacefox.perftests.quarkus.core.service849.Service849;
import fr.spacefox.perftests.quarkus.rest.endpoint849.schema.Schema849;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint849")
public class Endpoint849Resource {

    private final Service849 service;

    public Endpoint849Resource(Service849 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema849 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
