package fr.spacefox.perftests.quarkus.data.entity750;

import fr.spacefox.perftests.quarkus.core.port.data.Entity750DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service750.model.Model750;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity750Repository implements Entity750DatasourcePort, PanacheRepository<Entity750> {
    @Override
    public Optional<Model750> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
