package fr.spacefox.perftests.quarkus.data.entity561;

import fr.spacefox.perftests.quarkus.core.port.data.Entity561DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service561.model.Model561;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity561Repository implements Entity561DatasourcePort, PanacheRepository<Entity561> {
    @Override
    public Optional<Model561> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
