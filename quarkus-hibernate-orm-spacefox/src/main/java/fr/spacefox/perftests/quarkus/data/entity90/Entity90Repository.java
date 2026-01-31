package fr.spacefox.perftests.quarkus.data.entity90;

import fr.spacefox.perftests.quarkus.core.port.data.Entity90DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service90.model.Model90;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity90Repository implements Entity90DatasourcePort, PanacheRepository<Entity90> {
    @Override
    public Optional<Model90> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
