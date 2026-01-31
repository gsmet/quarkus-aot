package fr.spacefox.perftests.quarkus.data.entity957;

import fr.spacefox.perftests.quarkus.core.port.data.Entity957DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service957.model.Model957;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity957Repository implements Entity957DatasourcePort, PanacheRepository<Entity957> {
    @Override
    public Optional<Model957> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
