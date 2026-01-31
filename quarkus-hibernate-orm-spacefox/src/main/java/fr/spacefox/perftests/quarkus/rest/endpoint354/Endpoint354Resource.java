package fr.spacefox.perftests.quarkus.rest.endpoint354;

import fr.spacefox.perftests.quarkus.core.service354.Service354;
import fr.spacefox.perftests.quarkus.rest.endpoint354.schema.Schema354;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint354")
public class Endpoint354Resource {

    private final Service354 service;

    public Endpoint354Resource(Service354 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema354 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
