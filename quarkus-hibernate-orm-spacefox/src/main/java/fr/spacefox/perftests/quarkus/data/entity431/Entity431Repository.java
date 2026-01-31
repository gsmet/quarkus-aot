package fr.spacefox.perftests.quarkus.data.entity431;

import fr.spacefox.perftests.quarkus.core.port.data.Entity431DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service431.model.Model431;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity431Repository implements Entity431DatasourcePort, PanacheRepository<Entity431> {
    @Override
    public Optional<Model431> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
