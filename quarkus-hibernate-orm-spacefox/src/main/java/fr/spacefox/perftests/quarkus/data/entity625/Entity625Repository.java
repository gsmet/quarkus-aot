package fr.spacefox.perftests.quarkus.data.entity625;

import fr.spacefox.perftests.quarkus.core.port.data.Entity625DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service625.model.Model625;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity625Repository implements Entity625DatasourcePort, PanacheRepository<Entity625> {
    @Override
    public Optional<Model625> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
