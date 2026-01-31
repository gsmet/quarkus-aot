package fr.spacefox.perftests.quarkus.rest.endpoint620;

import fr.spacefox.perftests.quarkus.core.service620.Service620;
import fr.spacefox.perftests.quarkus.rest.endpoint620.schema.Schema620;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint620")
public class Endpoint620Resource {

    private final Service620 service;

    public Endpoint620Resource(Service620 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema620 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
