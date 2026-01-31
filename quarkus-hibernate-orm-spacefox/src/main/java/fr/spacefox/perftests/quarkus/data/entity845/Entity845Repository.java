package fr.spacefox.perftests.quarkus.data.entity845;

import fr.spacefox.perftests.quarkus.core.port.data.Entity845DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service845.model.Model845;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity845Repository implements Entity845DatasourcePort, PanacheRepository<Entity845> {
    @Override
    public Optional<Model845> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
