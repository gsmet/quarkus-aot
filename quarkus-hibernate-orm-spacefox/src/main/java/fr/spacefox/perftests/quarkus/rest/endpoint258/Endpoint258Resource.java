package fr.spacefox.perftests.quarkus.rest.endpoint258;

import fr.spacefox.perftests.quarkus.core.service258.Service258;
import fr.spacefox.perftests.quarkus.rest.endpoint258.schema.Schema258;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint258")
public class Endpoint258Resource {

    private final Service258 service;

    public Endpoint258Resource(Service258 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema258 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
