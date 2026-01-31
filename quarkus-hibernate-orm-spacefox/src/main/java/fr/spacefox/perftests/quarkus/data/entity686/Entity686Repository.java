package fr.spacefox.perftests.quarkus.data.entity686;

import fr.spacefox.perftests.quarkus.core.port.data.Entity686DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service686.model.Model686;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity686Repository implements Entity686DatasourcePort, PanacheRepository<Entity686> {
    @Override
    public Optional<Model686> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
