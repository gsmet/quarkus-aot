package fr.spacefox.perftests.quarkus.data.entity249;

import fr.spacefox.perftests.quarkus.core.port.data.Entity249DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service249.model.Model249;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity249Repository implements Entity249DatasourcePort, PanacheRepository<Entity249> {
    @Override
    public Optional<Model249> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
