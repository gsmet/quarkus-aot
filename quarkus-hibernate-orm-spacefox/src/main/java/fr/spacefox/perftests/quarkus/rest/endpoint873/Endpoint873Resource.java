package fr.spacefox.perftests.quarkus.rest.endpoint873;

import fr.spacefox.perftests.quarkus.core.service873.Service873;
import fr.spacefox.perftests.quarkus.rest.endpoint873.schema.Schema873;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint873")
public class Endpoint873Resource {

    private final Service873 service;

    public Endpoint873Resource(Service873 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema873 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
