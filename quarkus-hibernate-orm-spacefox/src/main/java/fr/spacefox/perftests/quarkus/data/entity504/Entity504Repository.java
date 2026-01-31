package fr.spacefox.perftests.quarkus.data.entity504;

import fr.spacefox.perftests.quarkus.core.port.data.Entity504DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service504.model.Model504;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity504Repository implements Entity504DatasourcePort, PanacheRepository<Entity504> {
    @Override
    public Optional<Model504> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
