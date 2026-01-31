package fr.spacefox.perftests.quarkus.rest.endpoint905;

import fr.spacefox.perftests.quarkus.core.service905.Service905;
import fr.spacefox.perftests.quarkus.rest.endpoint905.schema.Schema905;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint905")
public class Endpoint905Resource {

    private final Service905 service;

    public Endpoint905Resource(Service905 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema905 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
