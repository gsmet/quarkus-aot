package fr.spacefox.perftests.quarkus.rest.endpoint194;

import fr.spacefox.perftests.quarkus.core.service194.Service194;
import fr.spacefox.perftests.quarkus.rest.endpoint194.schema.Schema194;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint194")
public class Endpoint194Resource {

    private final Service194 service;

    public Endpoint194Resource(Service194 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema194 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
