package fr.spacefox.perftests.quarkus.rest.endpoint659;

import fr.spacefox.perftests.quarkus.core.service659.Service659;
import fr.spacefox.perftests.quarkus.rest.endpoint659.schema.Schema659;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint659")
public class Endpoint659Resource {

    private final Service659 service;

    public Endpoint659Resource(Service659 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema659 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
