package fr.spacefox.perftests.quarkus.data.entity479;

import fr.spacefox.perftests.quarkus.core.port.data.Entity479DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service479.model.Model479;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity479Repository implements Entity479DatasourcePort, PanacheRepository<Entity479> {
    @Override
    public Optional<Model479> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
