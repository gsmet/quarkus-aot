package fr.spacefox.perftests.quarkus.data.entity356;

import fr.spacefox.perftests.quarkus.core.port.data.Entity356DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service356.model.Model356;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity356Repository implements Entity356DatasourcePort, PanacheRepository<Entity356> {
    @Override
    public Optional<Model356> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
