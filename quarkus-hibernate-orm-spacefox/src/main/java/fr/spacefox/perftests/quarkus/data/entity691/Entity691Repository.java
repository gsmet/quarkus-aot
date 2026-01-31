package fr.spacefox.perftests.quarkus.data.entity691;

import fr.spacefox.perftests.quarkus.core.port.data.Entity691DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service691.model.Model691;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity691Repository implements Entity691DatasourcePort, PanacheRepository<Entity691> {
    @Override
    public Optional<Model691> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
