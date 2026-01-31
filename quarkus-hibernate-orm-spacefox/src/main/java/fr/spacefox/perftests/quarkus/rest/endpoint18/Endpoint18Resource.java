package fr.spacefox.perftests.quarkus.rest.endpoint18;

import fr.spacefox.perftests.quarkus.core.service18.Service18;
import fr.spacefox.perftests.quarkus.rest.endpoint18.schema.Schema18;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint18")
public class Endpoint18Resource {

    private final Service18 service;

    public Endpoint18Resource(Service18 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema18 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
