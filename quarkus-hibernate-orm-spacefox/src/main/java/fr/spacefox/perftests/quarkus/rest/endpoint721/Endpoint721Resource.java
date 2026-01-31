package fr.spacefox.perftests.quarkus.rest.endpoint721;

import fr.spacefox.perftests.quarkus.core.service721.Service721;
import fr.spacefox.perftests.quarkus.rest.endpoint721.schema.Schema721;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint721")
public class Endpoint721Resource {

    private final Service721 service;

    public Endpoint721Resource(Service721 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema721 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
