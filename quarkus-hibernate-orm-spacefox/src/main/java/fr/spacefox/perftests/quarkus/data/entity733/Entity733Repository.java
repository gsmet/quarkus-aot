package fr.spacefox.perftests.quarkus.data.entity733;

import fr.spacefox.perftests.quarkus.core.port.data.Entity733DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service733.model.Model733;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity733Repository implements Entity733DatasourcePort, PanacheRepository<Entity733> {
    @Override
    public Optional<Model733> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
