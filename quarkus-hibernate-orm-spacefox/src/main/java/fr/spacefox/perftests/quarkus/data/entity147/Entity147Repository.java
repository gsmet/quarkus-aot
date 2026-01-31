package fr.spacefox.perftests.quarkus.data.entity147;

import fr.spacefox.perftests.quarkus.core.port.data.Entity147DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service147.model.Model147;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity147Repository implements Entity147DatasourcePort, PanacheRepository<Entity147> {
    @Override
    public Optional<Model147> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
