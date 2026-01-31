package fr.spacefox.perftests.quarkus.data.entity986;

import fr.spacefox.perftests.quarkus.core.port.data.Entity986DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service986.model.Model986;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity986Repository implements Entity986DatasourcePort, PanacheRepository<Entity986> {
    @Override
    public Optional<Model986> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
