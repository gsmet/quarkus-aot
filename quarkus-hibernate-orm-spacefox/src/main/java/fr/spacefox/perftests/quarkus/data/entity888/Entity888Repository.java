package fr.spacefox.perftests.quarkus.data.entity888;

import fr.spacefox.perftests.quarkus.core.port.data.Entity888DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service888.model.Model888;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity888Repository implements Entity888DatasourcePort, PanacheRepository<Entity888> {
    @Override
    public Optional<Model888> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
