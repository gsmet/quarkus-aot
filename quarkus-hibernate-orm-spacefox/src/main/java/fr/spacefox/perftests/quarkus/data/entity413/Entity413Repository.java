package fr.spacefox.perftests.quarkus.data.entity413;

import fr.spacefox.perftests.quarkus.core.port.data.Entity413DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service413.model.Model413;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity413Repository implements Entity413DatasourcePort, PanacheRepository<Entity413> {
    @Override
    public Optional<Model413> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
