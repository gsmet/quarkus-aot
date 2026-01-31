package fr.spacefox.perftests.quarkus.rest.endpoint887;

import fr.spacefox.perftests.quarkus.core.service887.Service887;
import fr.spacefox.perftests.quarkus.rest.endpoint887.schema.Schema887;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint887")
public class Endpoint887Resource {

    private final Service887 service;

    public Endpoint887Resource(Service887 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema887 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
