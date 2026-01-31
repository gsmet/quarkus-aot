package fr.spacefox.perftests.quarkus.data.entity229;

import fr.spacefox.perftests.quarkus.core.port.data.Entity229DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service229.model.Model229;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity229Repository implements Entity229DatasourcePort, PanacheRepository<Entity229> {
    @Override
    public Optional<Model229> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
