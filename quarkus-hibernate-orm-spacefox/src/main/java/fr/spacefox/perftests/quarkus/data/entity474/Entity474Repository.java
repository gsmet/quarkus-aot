package fr.spacefox.perftests.quarkus.data.entity474;

import fr.spacefox.perftests.quarkus.core.port.data.Entity474DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service474.model.Model474;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity474Repository implements Entity474DatasourcePort, PanacheRepository<Entity474> {
    @Override
    public Optional<Model474> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
