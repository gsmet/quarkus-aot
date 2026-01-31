package fr.spacefox.perftests.quarkus.data.entity210;

import fr.spacefox.perftests.quarkus.core.port.data.Entity210DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service210.model.Model210;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity210Repository implements Entity210DatasourcePort, PanacheRepository<Entity210> {
    @Override
    public Optional<Model210> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
