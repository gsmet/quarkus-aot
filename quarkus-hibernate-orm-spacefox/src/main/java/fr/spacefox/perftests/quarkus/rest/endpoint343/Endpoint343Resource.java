package fr.spacefox.perftests.quarkus.rest.endpoint343;

import fr.spacefox.perftests.quarkus.core.service343.Service343;
import fr.spacefox.perftests.quarkus.rest.endpoint343.schema.Schema343;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint343")
public class Endpoint343Resource {

    private final Service343 service;

    public Endpoint343Resource(Service343 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema343 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
