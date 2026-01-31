package fr.spacefox.perftests.quarkus.data.entity523;

import fr.spacefox.perftests.quarkus.core.port.data.Entity523DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service523.model.Model523;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity523Repository implements Entity523DatasourcePort, PanacheRepository<Entity523> {
    @Override
    public Optional<Model523> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
