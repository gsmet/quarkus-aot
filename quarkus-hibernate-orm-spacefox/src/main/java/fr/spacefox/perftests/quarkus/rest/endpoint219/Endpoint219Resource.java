package fr.spacefox.perftests.quarkus.rest.endpoint219;

import fr.spacefox.perftests.quarkus.core.service219.Service219;
import fr.spacefox.perftests.quarkus.rest.endpoint219.schema.Schema219;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint219")
public class Endpoint219Resource {

    private final Service219 service;

    public Endpoint219Resource(Service219 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema219 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
