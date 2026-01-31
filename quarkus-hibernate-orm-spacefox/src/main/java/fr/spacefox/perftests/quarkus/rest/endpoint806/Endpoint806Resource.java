package fr.spacefox.perftests.quarkus.rest.endpoint806;

import fr.spacefox.perftests.quarkus.core.service806.Service806;
import fr.spacefox.perftests.quarkus.rest.endpoint806.schema.Schema806;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint806")
public class Endpoint806Resource {

    private final Service806 service;

    public Endpoint806Resource(Service806 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema806 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
