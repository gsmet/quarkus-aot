package fr.spacefox.perftests.quarkus.data.entity93;

import fr.spacefox.perftests.quarkus.core.port.data.Entity93DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service93.model.Model93;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity93Repository implements Entity93DatasourcePort, PanacheRepository<Entity93> {
    @Override
    public Optional<Model93> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
