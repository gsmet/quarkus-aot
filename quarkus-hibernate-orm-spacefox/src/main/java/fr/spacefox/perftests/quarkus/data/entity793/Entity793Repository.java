package fr.spacefox.perftests.quarkus.data.entity793;

import fr.spacefox.perftests.quarkus.core.port.data.Entity793DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service793.model.Model793;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity793Repository implements Entity793DatasourcePort, PanacheRepository<Entity793> {
    @Override
    public Optional<Model793> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
