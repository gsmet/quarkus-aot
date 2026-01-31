package fr.spacefox.perftests.quarkus.data.entity595;

import fr.spacefox.perftests.quarkus.core.port.data.Entity595DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service595.model.Model595;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity595Repository implements Entity595DatasourcePort, PanacheRepository<Entity595> {
    @Override
    public Optional<Model595> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
