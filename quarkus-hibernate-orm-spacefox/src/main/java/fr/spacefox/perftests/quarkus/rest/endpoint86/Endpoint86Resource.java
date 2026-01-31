package fr.spacefox.perftests.quarkus.rest.endpoint86;

import fr.spacefox.perftests.quarkus.core.service86.Service86;
import fr.spacefox.perftests.quarkus.rest.endpoint86.schema.Schema86;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint86")
public class Endpoint86Resource {

    private final Service86 service;

    public Endpoint86Resource(Service86 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema86 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
