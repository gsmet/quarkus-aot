package fr.spacefox.perftests.quarkus.data.entity225;

import fr.spacefox.perftests.quarkus.core.port.data.Entity225DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service225.model.Model225;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity225Repository implements Entity225DatasourcePort, PanacheRepository<Entity225> {
    @Override
    public Optional<Model225> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
