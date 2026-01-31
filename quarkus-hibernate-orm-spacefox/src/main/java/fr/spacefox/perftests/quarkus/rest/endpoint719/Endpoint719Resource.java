package fr.spacefox.perftests.quarkus.rest.endpoint719;

import fr.spacefox.perftests.quarkus.core.service719.Service719;
import fr.spacefox.perftests.quarkus.rest.endpoint719.schema.Schema719;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint719")
public class Endpoint719Resource {

    private final Service719 service;

    public Endpoint719Resource(Service719 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema719 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
