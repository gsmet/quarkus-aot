package fr.spacefox.perftests.quarkus.rest.endpoint81;

import fr.spacefox.perftests.quarkus.core.service81.Service81;
import fr.spacefox.perftests.quarkus.rest.endpoint81.schema.Schema81;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint81")
public class Endpoint81Resource {

    private final Service81 service;

    public Endpoint81Resource(Service81 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema81 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
