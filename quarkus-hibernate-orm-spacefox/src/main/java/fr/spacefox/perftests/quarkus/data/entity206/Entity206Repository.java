package fr.spacefox.perftests.quarkus.data.entity206;

import fr.spacefox.perftests.quarkus.core.port.data.Entity206DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service206.model.Model206;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity206Repository implements Entity206DatasourcePort, PanacheRepository<Entity206> {
    @Override
    public Optional<Model206> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
