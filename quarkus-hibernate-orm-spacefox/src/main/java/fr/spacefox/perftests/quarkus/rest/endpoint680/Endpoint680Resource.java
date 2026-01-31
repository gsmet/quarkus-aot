package fr.spacefox.perftests.quarkus.rest.endpoint680;

import fr.spacefox.perftests.quarkus.core.service680.Service680;
import fr.spacefox.perftests.quarkus.rest.endpoint680.schema.Schema680;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint680")
public class Endpoint680Resource {

    private final Service680 service;

    public Endpoint680Resource(Service680 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema680 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
