package fr.spacefox.perftests.quarkus.rest.endpoint852;

import fr.spacefox.perftests.quarkus.core.service852.Service852;
import fr.spacefox.perftests.quarkus.rest.endpoint852.schema.Schema852;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint852")
public class Endpoint852Resource {

    private final Service852 service;

    public Endpoint852Resource(Service852 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema852 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
