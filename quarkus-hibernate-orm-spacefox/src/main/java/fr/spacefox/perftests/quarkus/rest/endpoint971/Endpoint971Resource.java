package fr.spacefox.perftests.quarkus.rest.endpoint971;

import fr.spacefox.perftests.quarkus.core.service971.Service971;
import fr.spacefox.perftests.quarkus.rest.endpoint971.schema.Schema971;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint971")
public class Endpoint971Resource {

    private final Service971 service;

    public Endpoint971Resource(Service971 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema971 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
