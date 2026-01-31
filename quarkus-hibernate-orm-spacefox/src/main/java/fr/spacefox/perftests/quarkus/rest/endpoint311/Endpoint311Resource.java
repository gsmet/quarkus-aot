package fr.spacefox.perftests.quarkus.rest.endpoint311;

import fr.spacefox.perftests.quarkus.core.service311.Service311;
import fr.spacefox.perftests.quarkus.rest.endpoint311.schema.Schema311;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint311")
public class Endpoint311Resource {

    private final Service311 service;

    public Endpoint311Resource(Service311 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema311 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
