package fr.spacefox.perftests.quarkus.data.entity277;

import fr.spacefox.perftests.quarkus.core.port.data.Entity277DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service277.model.Model277;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity277Repository implements Entity277DatasourcePort, PanacheRepository<Entity277> {
    @Override
    public Optional<Model277> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
