package fr.spacefox.perftests.quarkus.data.entity642;

import fr.spacefox.perftests.quarkus.core.port.data.Entity642DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service642.model.Model642;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity642Repository implements Entity642DatasourcePort, PanacheRepository<Entity642> {
    @Override
    public Optional<Model642> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
