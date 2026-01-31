package fr.spacefox.perftests.quarkus.rest.endpoint89;

import fr.spacefox.perftests.quarkus.core.service89.Service89;
import fr.spacefox.perftests.quarkus.rest.endpoint89.schema.Schema89;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint89")
public class Endpoint89Resource {

    private final Service89 service;

    public Endpoint89Resource(Service89 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema89 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
