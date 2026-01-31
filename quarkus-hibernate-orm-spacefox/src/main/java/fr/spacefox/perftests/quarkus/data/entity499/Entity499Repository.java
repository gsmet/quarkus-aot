package fr.spacefox.perftests.quarkus.data.entity499;

import fr.spacefox.perftests.quarkus.core.port.data.Entity499DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service499.model.Model499;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity499Repository implements Entity499DatasourcePort, PanacheRepository<Entity499> {
    @Override
    public Optional<Model499> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
