package fr.spacefox.perftests.quarkus.rest.endpoint301;

import fr.spacefox.perftests.quarkus.core.service301.Service301;
import fr.spacefox.perftests.quarkus.rest.endpoint301.schema.Schema301;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint301")
public class Endpoint301Resource {

    private final Service301 service;

    public Endpoint301Resource(Service301 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema301 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
