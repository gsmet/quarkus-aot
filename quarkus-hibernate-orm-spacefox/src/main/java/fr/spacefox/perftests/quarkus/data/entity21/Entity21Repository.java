package fr.spacefox.perftests.quarkus.data.entity21;

import fr.spacefox.perftests.quarkus.core.port.data.Entity21DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service21.model.Model21;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity21Repository implements Entity21DatasourcePort, PanacheRepository<Entity21> {
    @Override
    public Optional<Model21> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
