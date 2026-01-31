package fr.spacefox.perftests.quarkus.data.entity902;

import fr.spacefox.perftests.quarkus.core.port.data.Entity902DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service902.model.Model902;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity902Repository implements Entity902DatasourcePort, PanacheRepository<Entity902> {
    @Override
    public Optional<Model902> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
