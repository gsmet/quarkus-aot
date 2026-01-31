package fr.spacefox.perftests.quarkus.data.entity505;

import fr.spacefox.perftests.quarkus.core.port.data.Entity505DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service505.model.Model505;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity505Repository implements Entity505DatasourcePort, PanacheRepository<Entity505> {
    @Override
    public Optional<Model505> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
