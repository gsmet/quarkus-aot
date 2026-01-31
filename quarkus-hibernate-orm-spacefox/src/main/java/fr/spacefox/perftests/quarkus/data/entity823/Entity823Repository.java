package fr.spacefox.perftests.quarkus.data.entity823;

import fr.spacefox.perftests.quarkus.core.port.data.Entity823DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service823.model.Model823;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity823Repository implements Entity823DatasourcePort, PanacheRepository<Entity823> {
    @Override
    public Optional<Model823> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
