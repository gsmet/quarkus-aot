package fr.spacefox.perftests.quarkus.rest.endpoint983;

import fr.spacefox.perftests.quarkus.core.service983.Service983;
import fr.spacefox.perftests.quarkus.rest.endpoint983.schema.Schema983;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint983")
public class Endpoint983Resource {

    private final Service983 service;

    public Endpoint983Resource(Service983 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema983 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
