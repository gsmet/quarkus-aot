package fr.spacefox.perftests.quarkus.rest.endpoint974;

import fr.spacefox.perftests.quarkus.core.service974.Service974;
import fr.spacefox.perftests.quarkus.rest.endpoint974.schema.Schema974;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint974")
public class Endpoint974Resource {

    private final Service974 service;

    public Endpoint974Resource(Service974 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema974 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
