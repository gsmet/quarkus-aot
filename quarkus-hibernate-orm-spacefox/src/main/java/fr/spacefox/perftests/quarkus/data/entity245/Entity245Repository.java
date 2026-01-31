package fr.spacefox.perftests.quarkus.data.entity245;

import fr.spacefox.perftests.quarkus.core.port.data.Entity245DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service245.model.Model245;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity245Repository implements Entity245DatasourcePort, PanacheRepository<Entity245> {
    @Override
    public Optional<Model245> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
