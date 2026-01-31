package fr.spacefox.perftests.quarkus.data.entity64;

import fr.spacefox.perftests.quarkus.core.port.data.Entity64DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service64.model.Model64;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity64Repository implements Entity64DatasourcePort, PanacheRepository<Entity64> {
    @Override
    public Optional<Model64> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
