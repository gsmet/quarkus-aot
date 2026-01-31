package fr.spacefox.perftests.quarkus.data.entity951;

import fr.spacefox.perftests.quarkus.core.port.data.Entity951DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service951.model.Model951;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity951Repository implements Entity951DatasourcePort, PanacheRepository<Entity951> {
    @Override
    public Optional<Model951> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
