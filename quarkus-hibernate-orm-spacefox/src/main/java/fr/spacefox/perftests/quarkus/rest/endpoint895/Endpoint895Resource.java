package fr.spacefox.perftests.quarkus.rest.endpoint895;

import fr.spacefox.perftests.quarkus.core.service895.Service895;
import fr.spacefox.perftests.quarkus.rest.endpoint895.schema.Schema895;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint895")
public class Endpoint895Resource {

    private final Service895 service;

    public Endpoint895Resource(Service895 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema895 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
