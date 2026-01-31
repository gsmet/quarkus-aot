package fr.spacefox.perftests.quarkus.data.entity810;

import fr.spacefox.perftests.quarkus.core.port.data.Entity810DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service810.model.Model810;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity810Repository implements Entity810DatasourcePort, PanacheRepository<Entity810> {
    @Override
    public Optional<Model810> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
