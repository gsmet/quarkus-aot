package fr.spacefox.perftests.quarkus.rest.endpoint373;

import fr.spacefox.perftests.quarkus.core.service373.Service373;
import fr.spacefox.perftests.quarkus.rest.endpoint373.schema.Schema373;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint373")
public class Endpoint373Resource {

    private final Service373 service;

    public Endpoint373Resource(Service373 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema373 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
