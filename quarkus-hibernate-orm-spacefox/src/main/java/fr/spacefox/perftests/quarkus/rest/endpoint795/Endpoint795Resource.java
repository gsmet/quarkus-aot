package fr.spacefox.perftests.quarkus.rest.endpoint795;

import fr.spacefox.perftests.quarkus.core.service795.Service795;
import fr.spacefox.perftests.quarkus.rest.endpoint795.schema.Schema795;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint795")
public class Endpoint795Resource {

    private final Service795 service;

    public Endpoint795Resource(Service795 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema795 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
