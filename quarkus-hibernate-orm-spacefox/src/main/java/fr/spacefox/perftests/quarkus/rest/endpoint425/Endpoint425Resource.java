package fr.spacefox.perftests.quarkus.rest.endpoint425;

import fr.spacefox.perftests.quarkus.core.service425.Service425;
import fr.spacefox.perftests.quarkus.rest.endpoint425.schema.Schema425;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint425")
public class Endpoint425Resource {

    private final Service425 service;

    public Endpoint425Resource(Service425 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema425 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
