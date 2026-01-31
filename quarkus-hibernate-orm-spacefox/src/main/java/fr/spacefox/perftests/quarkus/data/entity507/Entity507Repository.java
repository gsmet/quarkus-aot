package fr.spacefox.perftests.quarkus.data.entity507;

import fr.spacefox.perftests.quarkus.core.port.data.Entity507DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service507.model.Model507;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity507Repository implements Entity507DatasourcePort, PanacheRepository<Entity507> {
    @Override
    public Optional<Model507> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
