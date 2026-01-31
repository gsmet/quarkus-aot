package fr.spacefox.perftests.quarkus.data.entity340;

import fr.spacefox.perftests.quarkus.core.port.data.Entity340DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service340.model.Model340;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity340Repository implements Entity340DatasourcePort, PanacheRepository<Entity340> {
    @Override
    public Optional<Model340> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
