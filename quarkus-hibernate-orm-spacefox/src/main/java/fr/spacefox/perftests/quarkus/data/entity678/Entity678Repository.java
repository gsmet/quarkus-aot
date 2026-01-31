package fr.spacefox.perftests.quarkus.data.entity678;

import fr.spacefox.perftests.quarkus.core.port.data.Entity678DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service678.model.Model678;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity678Repository implements Entity678DatasourcePort, PanacheRepository<Entity678> {
    @Override
    public Optional<Model678> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
