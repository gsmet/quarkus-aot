package fr.spacefox.perftests.quarkus.data.entity179;

import fr.spacefox.perftests.quarkus.core.port.data.Entity179DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service179.model.Model179;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity179Repository implements Entity179DatasourcePort, PanacheRepository<Entity179> {
    @Override
    public Optional<Model179> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
