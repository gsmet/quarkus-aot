package fr.spacefox.perftests.quarkus.data.entity491;

import fr.spacefox.perftests.quarkus.core.port.data.Entity491DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service491.model.Model491;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity491Repository implements Entity491DatasourcePort, PanacheRepository<Entity491> {
    @Override
    public Optional<Model491> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
