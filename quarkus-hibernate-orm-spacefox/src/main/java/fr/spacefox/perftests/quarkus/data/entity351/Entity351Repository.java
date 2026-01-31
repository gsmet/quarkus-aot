package fr.spacefox.perftests.quarkus.data.entity351;

import fr.spacefox.perftests.quarkus.core.port.data.Entity351DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service351.model.Model351;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity351Repository implements Entity351DatasourcePort, PanacheRepository<Entity351> {
    @Override
    public Optional<Model351> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
