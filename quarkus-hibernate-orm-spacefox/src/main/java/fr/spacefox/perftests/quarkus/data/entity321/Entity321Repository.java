package fr.spacefox.perftests.quarkus.data.entity321;

import fr.spacefox.perftests.quarkus.core.port.data.Entity321DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service321.model.Model321;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity321Repository implements Entity321DatasourcePort, PanacheRepository<Entity321> {
    @Override
    public Optional<Model321> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
