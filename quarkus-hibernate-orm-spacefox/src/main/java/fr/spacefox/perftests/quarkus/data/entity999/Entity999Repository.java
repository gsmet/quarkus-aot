package fr.spacefox.perftests.quarkus.data.entity999;

import fr.spacefox.perftests.quarkus.core.port.data.Entity999DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service999.model.Model999;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity999Repository implements Entity999DatasourcePort, PanacheRepository<Entity999> {
    @Override
    public Optional<Model999> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
