package fr.spacefox.perftests.quarkus.rest.endpoint287;

import fr.spacefox.perftests.quarkus.core.service287.Service287;
import fr.spacefox.perftests.quarkus.rest.endpoint287.schema.Schema287;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint287")
public class Endpoint287Resource {

    private final Service287 service;

    public Endpoint287Resource(Service287 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema287 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
