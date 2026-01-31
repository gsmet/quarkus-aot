package fr.spacefox.perftests.quarkus.data.entity811;

import fr.spacefox.perftests.quarkus.core.port.data.Entity811DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service811.model.Model811;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity811Repository implements Entity811DatasourcePort, PanacheRepository<Entity811> {
    @Override
    public Optional<Model811> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
