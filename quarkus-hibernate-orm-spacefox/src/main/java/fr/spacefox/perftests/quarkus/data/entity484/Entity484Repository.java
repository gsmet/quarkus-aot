package fr.spacefox.perftests.quarkus.data.entity484;

import fr.spacefox.perftests.quarkus.core.port.data.Entity484DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service484.model.Model484;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity484Repository implements Entity484DatasourcePort, PanacheRepository<Entity484> {
    @Override
    public Optional<Model484> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
