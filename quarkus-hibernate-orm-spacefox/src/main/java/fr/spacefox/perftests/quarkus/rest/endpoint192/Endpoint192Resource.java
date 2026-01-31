package fr.spacefox.perftests.quarkus.rest.endpoint192;

import fr.spacefox.perftests.quarkus.core.service192.Service192;
import fr.spacefox.perftests.quarkus.rest.endpoint192.schema.Schema192;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint192")
public class Endpoint192Resource {

    private final Service192 service;

    public Endpoint192Resource(Service192 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema192 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
