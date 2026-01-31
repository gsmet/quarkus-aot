package fr.spacefox.perftests.quarkus.rest.endpoint109;

import fr.spacefox.perftests.quarkus.core.service109.Service109;
import fr.spacefox.perftests.quarkus.rest.endpoint109.schema.Schema109;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint109")
public class Endpoint109Resource {

    private final Service109 service;

    public Endpoint109Resource(Service109 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema109 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
