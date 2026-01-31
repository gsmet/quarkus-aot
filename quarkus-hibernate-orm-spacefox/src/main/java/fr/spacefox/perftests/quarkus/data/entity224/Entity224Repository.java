package fr.spacefox.perftests.quarkus.data.entity224;

import fr.spacefox.perftests.quarkus.core.port.data.Entity224DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service224.model.Model224;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity224Repository implements Entity224DatasourcePort, PanacheRepository<Entity224> {
    @Override
    public Optional<Model224> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
