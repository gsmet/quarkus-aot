package fr.spacefox.perftests.quarkus.data.entity52;

import fr.spacefox.perftests.quarkus.core.port.data.Entity52DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service52.model.Model52;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity52Repository implements Entity52DatasourcePort, PanacheRepository<Entity52> {
    @Override
    public Optional<Model52> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
