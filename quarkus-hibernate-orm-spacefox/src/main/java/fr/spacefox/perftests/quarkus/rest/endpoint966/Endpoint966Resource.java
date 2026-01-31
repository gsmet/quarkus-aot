package fr.spacefox.perftests.quarkus.rest.endpoint966;

import fr.spacefox.perftests.quarkus.core.service966.Service966;
import fr.spacefox.perftests.quarkus.rest.endpoint966.schema.Schema966;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint966")
public class Endpoint966Resource {

    private final Service966 service;

    public Endpoint966Resource(Service966 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema966 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
