package fr.spacefox.perftests.quarkus.rest.endpoint631;

import fr.spacefox.perftests.quarkus.core.service631.Service631;
import fr.spacefox.perftests.quarkus.rest.endpoint631.schema.Schema631;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint631")
public class Endpoint631Resource {

    private final Service631 service;

    public Endpoint631Resource(Service631 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema631 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
