package fr.spacefox.perftests.quarkus.data.entity318;

import fr.spacefox.perftests.quarkus.core.port.data.Entity318DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service318.model.Model318;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity318Repository implements Entity318DatasourcePort, PanacheRepository<Entity318> {
    @Override
    public Optional<Model318> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
