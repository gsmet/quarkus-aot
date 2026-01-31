package fr.spacefox.perftests.quarkus.rest.endpoint874;

import fr.spacefox.perftests.quarkus.core.service874.Service874;
import fr.spacefox.perftests.quarkus.rest.endpoint874.schema.Schema874;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint874")
public class Endpoint874Resource {

    private final Service874 service;

    public Endpoint874Resource(Service874 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema874 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
