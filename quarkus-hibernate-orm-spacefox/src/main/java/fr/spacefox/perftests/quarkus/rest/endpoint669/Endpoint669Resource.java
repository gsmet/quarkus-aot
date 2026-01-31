package fr.spacefox.perftests.quarkus.rest.endpoint669;

import fr.spacefox.perftests.quarkus.core.service669.Service669;
import fr.spacefox.perftests.quarkus.rest.endpoint669.schema.Schema669;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint669")
public class Endpoint669Resource {

    private final Service669 service;

    public Endpoint669Resource(Service669 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema669 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
