package fr.spacefox.perftests.quarkus.data.entity342;

import fr.spacefox.perftests.quarkus.core.port.data.Entity342DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service342.model.Model342;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity342Repository implements Entity342DatasourcePort, PanacheRepository<Entity342> {
    @Override
    public Optional<Model342> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
