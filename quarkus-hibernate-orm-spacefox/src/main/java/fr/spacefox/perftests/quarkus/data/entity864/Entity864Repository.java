package fr.spacefox.perftests.quarkus.data.entity864;

import fr.spacefox.perftests.quarkus.core.port.data.Entity864DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service864.model.Model864;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity864Repository implements Entity864DatasourcePort, PanacheRepository<Entity864> {
    @Override
    public Optional<Model864> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
