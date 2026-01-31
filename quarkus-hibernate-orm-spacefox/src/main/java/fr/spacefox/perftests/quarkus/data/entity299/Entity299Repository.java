package fr.spacefox.perftests.quarkus.data.entity299;

import fr.spacefox.perftests.quarkus.core.port.data.Entity299DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service299.model.Model299;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity299Repository implements Entity299DatasourcePort, PanacheRepository<Entity299> {
    @Override
    public Optional<Model299> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
