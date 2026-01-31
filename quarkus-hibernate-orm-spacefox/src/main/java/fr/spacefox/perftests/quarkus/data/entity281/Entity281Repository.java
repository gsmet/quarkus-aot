package fr.spacefox.perftests.quarkus.data.entity281;

import fr.spacefox.perftests.quarkus.core.port.data.Entity281DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service281.model.Model281;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity281Repository implements Entity281DatasourcePort, PanacheRepository<Entity281> {
    @Override
    public Optional<Model281> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
