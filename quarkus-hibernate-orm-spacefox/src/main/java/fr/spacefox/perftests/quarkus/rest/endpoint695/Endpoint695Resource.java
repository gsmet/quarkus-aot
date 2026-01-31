package fr.spacefox.perftests.quarkus.rest.endpoint695;

import fr.spacefox.perftests.quarkus.core.service695.Service695;
import fr.spacefox.perftests.quarkus.rest.endpoint695.schema.Schema695;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint695")
public class Endpoint695Resource {

    private final Service695 service;

    public Endpoint695Resource(Service695 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema695 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
