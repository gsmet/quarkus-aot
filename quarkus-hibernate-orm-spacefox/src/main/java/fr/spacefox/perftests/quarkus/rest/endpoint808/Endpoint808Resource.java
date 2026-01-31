package fr.spacefox.perftests.quarkus.rest.endpoint808;

import fr.spacefox.perftests.quarkus.core.service808.Service808;
import fr.spacefox.perftests.quarkus.rest.endpoint808.schema.Schema808;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint808")
public class Endpoint808Resource {

    private final Service808 service;

    public Endpoint808Resource(Service808 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema808 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
