package fr.spacefox.perftests.quarkus.rest.endpoint412;

import fr.spacefox.perftests.quarkus.core.service412.Service412;
import fr.spacefox.perftests.quarkus.rest.endpoint412.schema.Schema412;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint412")
public class Endpoint412Resource {

    private final Service412 service;

    public Endpoint412Resource(Service412 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema412 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
