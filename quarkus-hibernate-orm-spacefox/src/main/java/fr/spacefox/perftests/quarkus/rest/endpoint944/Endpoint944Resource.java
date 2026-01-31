package fr.spacefox.perftests.quarkus.rest.endpoint944;

import fr.spacefox.perftests.quarkus.core.service944.Service944;
import fr.spacefox.perftests.quarkus.rest.endpoint944.schema.Schema944;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint944")
public class Endpoint944Resource {

    private final Service944 service;

    public Endpoint944Resource(Service944 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema944 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
