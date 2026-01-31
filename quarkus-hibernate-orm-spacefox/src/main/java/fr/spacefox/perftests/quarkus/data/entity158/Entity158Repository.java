package fr.spacefox.perftests.quarkus.data.entity158;

import fr.spacefox.perftests.quarkus.core.port.data.Entity158DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service158.model.Model158;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity158Repository implements Entity158DatasourcePort, PanacheRepository<Entity158> {
    @Override
    public Optional<Model158> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
