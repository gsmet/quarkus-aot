package fr.spacefox.perftests.quarkus.data.entity844;

import fr.spacefox.perftests.quarkus.core.port.data.Entity844DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service844.model.Model844;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity844Repository implements Entity844DatasourcePort, PanacheRepository<Entity844> {
    @Override
    public Optional<Model844> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
