package fr.spacefox.perftests.quarkus.data.entity438;

import fr.spacefox.perftests.quarkus.core.port.data.Entity438DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service438.model.Model438;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity438Repository implements Entity438DatasourcePort, PanacheRepository<Entity438> {
    @Override
    public Optional<Model438> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
