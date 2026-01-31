package fr.spacefox.perftests.quarkus.data.entity712;

import fr.spacefox.perftests.quarkus.core.port.data.Entity712DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service712.model.Model712;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity712Repository implements Entity712DatasourcePort, PanacheRepository<Entity712> {
    @Override
    public Optional<Model712> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
