package fr.spacefox.perftests.quarkus.rest.endpoint869;

import fr.spacefox.perftests.quarkus.core.service869.Service869;
import fr.spacefox.perftests.quarkus.rest.endpoint869.schema.Schema869;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint869")
public class Endpoint869Resource {

    private final Service869 service;

    public Endpoint869Resource(Service869 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema869 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
