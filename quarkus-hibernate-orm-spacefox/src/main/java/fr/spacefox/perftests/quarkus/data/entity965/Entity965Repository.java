package fr.spacefox.perftests.quarkus.data.entity965;

import fr.spacefox.perftests.quarkus.core.port.data.Entity965DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service965.model.Model965;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity965Repository implements Entity965DatasourcePort, PanacheRepository<Entity965> {
    @Override
    public Optional<Model965> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
