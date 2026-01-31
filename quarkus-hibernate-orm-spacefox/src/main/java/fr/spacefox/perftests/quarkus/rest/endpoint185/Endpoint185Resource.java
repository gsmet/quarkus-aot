package fr.spacefox.perftests.quarkus.rest.endpoint185;

import fr.spacefox.perftests.quarkus.core.service185.Service185;
import fr.spacefox.perftests.quarkus.rest.endpoint185.schema.Schema185;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint185")
public class Endpoint185Resource {

    private final Service185 service;

    public Endpoint185Resource(Service185 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema185 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
