package fr.spacefox.perftests.quarkus.data.entity539;

import fr.spacefox.perftests.quarkus.core.port.data.Entity539DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service539.model.Model539;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity539Repository implements Entity539DatasourcePort, PanacheRepository<Entity539> {
    @Override
    public Optional<Model539> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
