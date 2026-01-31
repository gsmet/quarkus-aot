package fr.spacefox.perftests.quarkus.data.entity531;

import fr.spacefox.perftests.quarkus.core.port.data.Entity531DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service531.model.Model531;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity531Repository implements Entity531DatasourcePort, PanacheRepository<Entity531> {
    @Override
    public Optional<Model531> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
