package fr.spacefox.perftests.quarkus.rest.endpoint199;

import fr.spacefox.perftests.quarkus.core.service199.Service199;
import fr.spacefox.perftests.quarkus.rest.endpoint199.schema.Schema199;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint199")
public class Endpoint199Resource {

    private final Service199 service;

    public Endpoint199Resource(Service199 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema199 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
