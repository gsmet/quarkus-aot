package fr.spacefox.perftests.quarkus.data.entity801;

import fr.spacefox.perftests.quarkus.core.port.data.Entity801DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service801.model.Model801;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity801Repository implements Entity801DatasourcePort, PanacheRepository<Entity801> {
    @Override
    public Optional<Model801> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
