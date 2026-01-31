package fr.spacefox.perftests.quarkus.data.entity451;

import fr.spacefox.perftests.quarkus.core.port.data.Entity451DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service451.model.Model451;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity451Repository implements Entity451DatasourcePort, PanacheRepository<Entity451> {
    @Override
    public Optional<Model451> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
