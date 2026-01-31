package fr.spacefox.perftests.quarkus.rest.endpoint276;

import fr.spacefox.perftests.quarkus.core.service276.Service276;
import fr.spacefox.perftests.quarkus.rest.endpoint276.schema.Schema276;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint276")
public class Endpoint276Resource {

    private final Service276 service;

    public Endpoint276Resource(Service276 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema276 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
