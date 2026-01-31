package fr.spacefox.perftests.quarkus.data.entity981;

import fr.spacefox.perftests.quarkus.core.port.data.Entity981DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service981.model.Model981;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity981Repository implements Entity981DatasourcePort, PanacheRepository<Entity981> {
    @Override
    public Optional<Model981> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
