package fr.spacefox.perftests.quarkus.data.entity859;

import fr.spacefox.perftests.quarkus.core.port.data.Entity859DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service859.model.Model859;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity859Repository implements Entity859DatasourcePort, PanacheRepository<Entity859> {
    @Override
    public Optional<Model859> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
