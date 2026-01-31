package fr.spacefox.perftests.quarkus.data.entity528;

import fr.spacefox.perftests.quarkus.core.port.data.Entity528DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service528.model.Model528;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity528Repository implements Entity528DatasourcePort, PanacheRepository<Entity528> {
    @Override
    public Optional<Model528> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
