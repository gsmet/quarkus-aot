package fr.spacefox.perftests.quarkus.rest.endpoint846;

import fr.spacefox.perftests.quarkus.core.service846.Service846;
import fr.spacefox.perftests.quarkus.rest.endpoint846.schema.Schema846;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint846")
public class Endpoint846Resource {

    private final Service846 service;

    public Endpoint846Resource(Service846 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema846 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
