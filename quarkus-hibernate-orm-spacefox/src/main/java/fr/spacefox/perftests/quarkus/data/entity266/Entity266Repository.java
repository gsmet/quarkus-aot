package fr.spacefox.perftests.quarkus.data.entity266;

import fr.spacefox.perftests.quarkus.core.port.data.Entity266DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service266.model.Model266;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity266Repository implements Entity266DatasourcePort, PanacheRepository<Entity266> {
    @Override
    public Optional<Model266> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
