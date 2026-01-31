package fr.spacefox.perftests.quarkus.data.entity220;

import fr.spacefox.perftests.quarkus.core.port.data.Entity220DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service220.model.Model220;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity220Repository implements Entity220DatasourcePort, PanacheRepository<Entity220> {
    @Override
    public Optional<Model220> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
