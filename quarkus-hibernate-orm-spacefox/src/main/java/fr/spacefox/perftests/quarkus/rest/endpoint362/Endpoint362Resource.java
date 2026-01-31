package fr.spacefox.perftests.quarkus.rest.endpoint362;

import fr.spacefox.perftests.quarkus.core.service362.Service362;
import fr.spacefox.perftests.quarkus.rest.endpoint362.schema.Schema362;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint362")
public class Endpoint362Resource {

    private final Service362 service;

    public Endpoint362Resource(Service362 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema362 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
