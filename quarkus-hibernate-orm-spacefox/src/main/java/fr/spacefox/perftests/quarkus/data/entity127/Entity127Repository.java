package fr.spacefox.perftests.quarkus.data.entity127;

import fr.spacefox.perftests.quarkus.core.port.data.Entity127DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service127.model.Model127;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity127Repository implements Entity127DatasourcePort, PanacheRepository<Entity127> {
    @Override
    public Optional<Model127> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
