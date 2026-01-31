package fr.spacefox.perftests.quarkus.data.entity633;

import fr.spacefox.perftests.quarkus.core.port.data.Entity633DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service633.model.Model633;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity633Repository implements Entity633DatasourcePort, PanacheRepository<Entity633> {
    @Override
    public Optional<Model633> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
