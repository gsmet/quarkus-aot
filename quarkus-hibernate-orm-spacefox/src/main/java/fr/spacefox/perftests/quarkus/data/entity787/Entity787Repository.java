package fr.spacefox.perftests.quarkus.data.entity787;

import fr.spacefox.perftests.quarkus.core.port.data.Entity787DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service787.model.Model787;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity787Repository implements Entity787DatasourcePort, PanacheRepository<Entity787> {
    @Override
    public Optional<Model787> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
