package fr.spacefox.perftests.quarkus.rest.endpoint760;

import fr.spacefox.perftests.quarkus.core.service760.Service760;
import fr.spacefox.perftests.quarkus.rest.endpoint760.schema.Schema760;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint760")
public class Endpoint760Resource {

    private final Service760 service;

    public Endpoint760Resource(Service760 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema760 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
