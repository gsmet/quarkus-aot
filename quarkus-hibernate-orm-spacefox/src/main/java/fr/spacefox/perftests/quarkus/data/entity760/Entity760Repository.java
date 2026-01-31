package fr.spacefox.perftests.quarkus.data.entity760;

import fr.spacefox.perftests.quarkus.core.port.data.Entity760DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service760.model.Model760;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity760Repository implements Entity760DatasourcePort, PanacheRepository<Entity760> {
    @Override
    public Optional<Model760> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
