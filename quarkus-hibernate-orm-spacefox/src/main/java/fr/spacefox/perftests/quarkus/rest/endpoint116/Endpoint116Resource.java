package fr.spacefox.perftests.quarkus.rest.endpoint116;

import fr.spacefox.perftests.quarkus.core.service116.Service116;
import fr.spacefox.perftests.quarkus.rest.endpoint116.schema.Schema116;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint116")
public class Endpoint116Resource {

    private final Service116 service;

    public Endpoint116Resource(Service116 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema116 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
