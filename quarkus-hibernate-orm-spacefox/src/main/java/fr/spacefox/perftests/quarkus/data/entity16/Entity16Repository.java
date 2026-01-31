package fr.spacefox.perftests.quarkus.data.entity16;

import fr.spacefox.perftests.quarkus.core.port.data.Entity16DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service16.model.Model16;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity16Repository implements Entity16DatasourcePort, PanacheRepository<Entity16> {
    @Override
    public Optional<Model16> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
