package fr.spacefox.perftests.quarkus.rest.endpoint851;

import fr.spacefox.perftests.quarkus.core.service851.Service851;
import fr.spacefox.perftests.quarkus.rest.endpoint851.schema.Schema851;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint851")
public class Endpoint851Resource {

    private final Service851 service;

    public Endpoint851Resource(Service851 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema851 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
