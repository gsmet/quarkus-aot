package fr.spacefox.perftests.quarkus.data.entity191;

import fr.spacefox.perftests.quarkus.core.port.data.Entity191DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service191.model.Model191;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity191Repository implements Entity191DatasourcePort, PanacheRepository<Entity191> {
    @Override
    public Optional<Model191> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
