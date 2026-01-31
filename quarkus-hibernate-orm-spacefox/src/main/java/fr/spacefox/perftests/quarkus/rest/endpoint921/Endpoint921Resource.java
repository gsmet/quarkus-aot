package fr.spacefox.perftests.quarkus.rest.endpoint921;

import fr.spacefox.perftests.quarkus.core.service921.Service921;
import fr.spacefox.perftests.quarkus.rest.endpoint921.schema.Schema921;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint921")
public class Endpoint921Resource {

    private final Service921 service;

    public Endpoint921Resource(Service921 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema921 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
