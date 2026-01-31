package fr.spacefox.perftests.quarkus.rest.endpoint110;

import fr.spacefox.perftests.quarkus.core.service110.Service110;
import fr.spacefox.perftests.quarkus.rest.endpoint110.schema.Schema110;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint110")
public class Endpoint110Resource {

    private final Service110 service;

    public Endpoint110Resource(Service110 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema110 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
