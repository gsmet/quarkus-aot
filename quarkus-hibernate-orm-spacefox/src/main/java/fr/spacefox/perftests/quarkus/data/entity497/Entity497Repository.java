package fr.spacefox.perftests.quarkus.data.entity497;

import fr.spacefox.perftests.quarkus.core.port.data.Entity497DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service497.model.Model497;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity497Repository implements Entity497DatasourcePort, PanacheRepository<Entity497> {
    @Override
    public Optional<Model497> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
