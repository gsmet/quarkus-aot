package fr.spacefox.perftests.quarkus.rest.endpoint162;

import fr.spacefox.perftests.quarkus.core.service162.Service162;
import fr.spacefox.perftests.quarkus.rest.endpoint162.schema.Schema162;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint162")
public class Endpoint162Resource {

    private final Service162 service;

    public Endpoint162Resource(Service162 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema162 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
