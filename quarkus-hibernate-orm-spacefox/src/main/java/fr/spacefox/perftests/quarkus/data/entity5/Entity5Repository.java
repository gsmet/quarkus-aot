package fr.spacefox.perftests.quarkus.data.entity5;

import fr.spacefox.perftests.quarkus.core.port.data.Entity5DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service5.model.Model5;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity5Repository implements Entity5DatasourcePort, PanacheRepository<Entity5> {
    @Override
    public Optional<Model5> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
