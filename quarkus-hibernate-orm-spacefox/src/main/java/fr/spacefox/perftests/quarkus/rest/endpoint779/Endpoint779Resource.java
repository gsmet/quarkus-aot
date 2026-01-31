package fr.spacefox.perftests.quarkus.rest.endpoint779;

import fr.spacefox.perftests.quarkus.core.service779.Service779;
import fr.spacefox.perftests.quarkus.rest.endpoint779.schema.Schema779;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint779")
public class Endpoint779Resource {

    private final Service779 service;

    public Endpoint779Resource(Service779 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema779 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
