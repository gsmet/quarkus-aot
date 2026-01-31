package fr.spacefox.perftests.quarkus.rest.endpoint352;

import fr.spacefox.perftests.quarkus.core.service352.Service352;
import fr.spacefox.perftests.quarkus.rest.endpoint352.schema.Schema352;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint352")
public class Endpoint352Resource {

    private final Service352 service;

    public Endpoint352Resource(Service352 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema352 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
