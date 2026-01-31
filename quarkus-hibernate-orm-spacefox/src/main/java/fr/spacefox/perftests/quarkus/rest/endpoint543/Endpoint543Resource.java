package fr.spacefox.perftests.quarkus.rest.endpoint543;

import fr.spacefox.perftests.quarkus.core.service543.Service543;
import fr.spacefox.perftests.quarkus.rest.endpoint543.schema.Schema543;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint543")
public class Endpoint543Resource {

    private final Service543 service;

    public Endpoint543Resource(Service543 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema543 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
