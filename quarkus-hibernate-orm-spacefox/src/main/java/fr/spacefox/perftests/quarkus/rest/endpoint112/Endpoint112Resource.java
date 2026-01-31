package fr.spacefox.perftests.quarkus.rest.endpoint112;

import fr.spacefox.perftests.quarkus.core.service112.Service112;
import fr.spacefox.perftests.quarkus.rest.endpoint112.schema.Schema112;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint112")
public class Endpoint112Resource {

    private final Service112 service;

    public Endpoint112Resource(Service112 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema112 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
