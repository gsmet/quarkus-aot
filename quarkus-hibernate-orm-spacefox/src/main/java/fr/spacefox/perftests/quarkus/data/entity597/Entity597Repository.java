package fr.spacefox.perftests.quarkus.data.entity597;

import fr.spacefox.perftests.quarkus.core.port.data.Entity597DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service597.model.Model597;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity597Repository implements Entity597DatasourcePort, PanacheRepository<Entity597> {
    @Override
    public Optional<Model597> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
