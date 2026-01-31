package fr.spacefox.perftests.quarkus.data.entity841;

import fr.spacefox.perftests.quarkus.core.port.data.Entity841DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service841.model.Model841;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity841Repository implements Entity841DatasourcePort, PanacheRepository<Entity841> {
    @Override
    public Optional<Model841> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
