package fr.spacefox.perftests.quarkus.data.entity765;

import fr.spacefox.perftests.quarkus.core.port.data.Entity765DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service765.model.Model765;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity765Repository implements Entity765DatasourcePort, PanacheRepository<Entity765> {
    @Override
    public Optional<Model765> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
