package fr.spacefox.perftests.quarkus.data.entity663;

import fr.spacefox.perftests.quarkus.core.port.data.Entity663DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service663.model.Model663;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity663Repository implements Entity663DatasourcePort, PanacheRepository<Entity663> {
    @Override
    public Optional<Model663> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
