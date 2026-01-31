package fr.spacefox.perftests.quarkus.rest.endpoint870;

import fr.spacefox.perftests.quarkus.core.service870.Service870;
import fr.spacefox.perftests.quarkus.rest.endpoint870.schema.Schema870;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint870")
public class Endpoint870Resource {

    private final Service870 service;

    public Endpoint870Resource(Service870 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema870 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
