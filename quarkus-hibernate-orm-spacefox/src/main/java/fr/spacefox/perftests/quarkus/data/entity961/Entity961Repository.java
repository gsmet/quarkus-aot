package fr.spacefox.perftests.quarkus.data.entity961;

import fr.spacefox.perftests.quarkus.core.port.data.Entity961DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service961.model.Model961;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity961Repository implements Entity961DatasourcePort, PanacheRepository<Entity961> {
    @Override
    public Optional<Model961> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
