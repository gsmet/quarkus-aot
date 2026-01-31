package fr.spacefox.perftests.quarkus.data.entity483;

import fr.spacefox.perftests.quarkus.core.port.data.Entity483DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service483.model.Model483;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity483Repository implements Entity483DatasourcePort, PanacheRepository<Entity483> {
    @Override
    public Optional<Model483> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
