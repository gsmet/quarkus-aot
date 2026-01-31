package fr.spacefox.perftests.quarkus.rest.endpoint97;

import fr.spacefox.perftests.quarkus.core.service97.Service97;
import fr.spacefox.perftests.quarkus.rest.endpoint97.schema.Schema97;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint97")
public class Endpoint97Resource {

    private final Service97 service;

    public Endpoint97Resource(Service97 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema97 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
