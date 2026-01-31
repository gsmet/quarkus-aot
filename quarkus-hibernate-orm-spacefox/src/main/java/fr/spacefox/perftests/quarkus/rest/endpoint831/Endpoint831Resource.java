package fr.spacefox.perftests.quarkus.rest.endpoint831;

import fr.spacefox.perftests.quarkus.core.service831.Service831;
import fr.spacefox.perftests.quarkus.rest.endpoint831.schema.Schema831;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint831")
public class Endpoint831Resource {

    private final Service831 service;

    public Endpoint831Resource(Service831 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema831 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
