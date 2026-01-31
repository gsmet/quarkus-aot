package fr.spacefox.perftests.quarkus.data.entity993;

import fr.spacefox.perftests.quarkus.core.port.data.Entity993DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service993.model.Model993;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity993Repository implements Entity993DatasourcePort, PanacheRepository<Entity993> {
    @Override
    public Optional<Model993> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
