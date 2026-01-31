package fr.spacefox.perftests.quarkus.data.entity129;

import fr.spacefox.perftests.quarkus.core.port.data.Entity129DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service129.model.Model129;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity129Repository implements Entity129DatasourcePort, PanacheRepository<Entity129> {
    @Override
    public Optional<Model129> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
