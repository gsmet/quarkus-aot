package fr.spacefox.perftests.quarkus.data.entity350;

import fr.spacefox.perftests.quarkus.core.port.data.Entity350DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service350.model.Model350;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity350Repository implements Entity350DatasourcePort, PanacheRepository<Entity350> {
    @Override
    public Optional<Model350> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
