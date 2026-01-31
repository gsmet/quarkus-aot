package fr.spacefox.perftests.quarkus.rest.endpoint191;

import fr.spacefox.perftests.quarkus.core.service191.Service191;
import fr.spacefox.perftests.quarkus.rest.endpoint191.schema.Schema191;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint191")
public class Endpoint191Resource {

    private final Service191 service;

    public Endpoint191Resource(Service191 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema191 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
