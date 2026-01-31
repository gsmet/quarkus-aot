package fr.spacefox.perftests.quarkus.data.entity964;

import fr.spacefox.perftests.quarkus.core.port.data.Entity964DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service964.model.Model964;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity964Repository implements Entity964DatasourcePort, PanacheRepository<Entity964> {
    @Override
    public Optional<Model964> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
