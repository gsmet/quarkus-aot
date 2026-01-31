package fr.spacefox.perftests.quarkus.rest.endpoint8;

import fr.spacefox.perftests.quarkus.core.service8.Service8;
import fr.spacefox.perftests.quarkus.rest.endpoint8.schema.Schema8;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint8")
public class Endpoint8Resource {

    private final Service8 service;

    public Endpoint8Resource(Service8 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema8 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
