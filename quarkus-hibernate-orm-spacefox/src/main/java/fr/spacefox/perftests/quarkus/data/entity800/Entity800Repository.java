package fr.spacefox.perftests.quarkus.data.entity800;

import fr.spacefox.perftests.quarkus.core.port.data.Entity800DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service800.model.Model800;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity800Repository implements Entity800DatasourcePort, PanacheRepository<Entity800> {
    @Override
    public Optional<Model800> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
