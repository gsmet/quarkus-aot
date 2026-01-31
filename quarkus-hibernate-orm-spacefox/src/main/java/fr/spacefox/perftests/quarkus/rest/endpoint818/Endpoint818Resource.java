package fr.spacefox.perftests.quarkus.rest.endpoint818;

import fr.spacefox.perftests.quarkus.core.service818.Service818;
import fr.spacefox.perftests.quarkus.rest.endpoint818.schema.Schema818;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint818")
public class Endpoint818Resource {

    private final Service818 service;

    public Endpoint818Resource(Service818 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema818 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
