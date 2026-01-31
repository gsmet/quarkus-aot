package fr.spacefox.perftests.quarkus.rest.endpoint452;

import fr.spacefox.perftests.quarkus.core.service452.Service452;
import fr.spacefox.perftests.quarkus.rest.endpoint452.schema.Schema452;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint452")
public class Endpoint452Resource {

    private final Service452 service;

    public Endpoint452Resource(Service452 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema452 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
