package fr.spacefox.perftests.quarkus.data.entity390;

import fr.spacefox.perftests.quarkus.core.port.data.Entity390DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service390.model.Model390;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity390Repository implements Entity390DatasourcePort, PanacheRepository<Entity390> {
    @Override
    public Optional<Model390> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
