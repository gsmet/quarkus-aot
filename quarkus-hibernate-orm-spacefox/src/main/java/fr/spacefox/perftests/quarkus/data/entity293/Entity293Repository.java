package fr.spacefox.perftests.quarkus.data.entity293;

import fr.spacefox.perftests.quarkus.core.port.data.Entity293DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service293.model.Model293;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity293Repository implements Entity293DatasourcePort, PanacheRepository<Entity293> {
    @Override
    public Optional<Model293> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
