package fr.spacefox.perftests.quarkus.data.entity522;

import fr.spacefox.perftests.quarkus.core.port.data.Entity522DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service522.model.Model522;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity522Repository implements Entity522DatasourcePort, PanacheRepository<Entity522> {
    @Override
    public Optional<Model522> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
