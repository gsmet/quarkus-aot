package fr.spacefox.perftests.quarkus.data.entity387;

import fr.spacefox.perftests.quarkus.core.port.data.Entity387DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service387.model.Model387;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity387Repository implements Entity387DatasourcePort, PanacheRepository<Entity387> {
    @Override
    public Optional<Model387> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
