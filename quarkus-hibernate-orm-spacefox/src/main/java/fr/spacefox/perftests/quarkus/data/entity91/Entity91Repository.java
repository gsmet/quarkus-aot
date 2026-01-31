package fr.spacefox.perftests.quarkus.data.entity91;

import fr.spacefox.perftests.quarkus.core.port.data.Entity91DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service91.model.Model91;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity91Repository implements Entity91DatasourcePort, PanacheRepository<Entity91> {
    @Override
    public Optional<Model91> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
