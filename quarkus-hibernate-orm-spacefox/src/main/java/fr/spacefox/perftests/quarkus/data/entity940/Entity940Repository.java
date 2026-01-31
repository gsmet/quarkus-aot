package fr.spacefox.perftests.quarkus.data.entity940;

import fr.spacefox.perftests.quarkus.core.port.data.Entity940DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service940.model.Model940;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity940Repository implements Entity940DatasourcePort, PanacheRepository<Entity940> {
    @Override
    public Optional<Model940> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
