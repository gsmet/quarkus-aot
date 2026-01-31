package fr.spacefox.perftests.quarkus.data.entity937;

import fr.spacefox.perftests.quarkus.core.port.data.Entity937DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service937.model.Model937;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity937Repository implements Entity937DatasourcePort, PanacheRepository<Entity937> {
    @Override
    public Optional<Model937> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
