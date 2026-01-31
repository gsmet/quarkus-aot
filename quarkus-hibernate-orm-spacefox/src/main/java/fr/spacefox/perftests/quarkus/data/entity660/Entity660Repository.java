package fr.spacefox.perftests.quarkus.data.entity660;

import fr.spacefox.perftests.quarkus.core.port.data.Entity660DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service660.model.Model660;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity660Repository implements Entity660DatasourcePort, PanacheRepository<Entity660> {
    @Override
    public Optional<Model660> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
