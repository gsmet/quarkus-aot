package fr.spacefox.perftests.quarkus.data.entity160;

import fr.spacefox.perftests.quarkus.core.port.data.Entity160DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service160.model.Model160;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity160Repository implements Entity160DatasourcePort, PanacheRepository<Entity160> {
    @Override
    public Optional<Model160> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
