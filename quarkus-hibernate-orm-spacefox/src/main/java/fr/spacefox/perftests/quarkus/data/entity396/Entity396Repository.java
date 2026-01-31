package fr.spacefox.perftests.quarkus.data.entity396;

import fr.spacefox.perftests.quarkus.core.port.data.Entity396DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service396.model.Model396;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity396Repository implements Entity396DatasourcePort, PanacheRepository<Entity396> {
    @Override
    public Optional<Model396> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
