package fr.spacefox.perftests.quarkus.data.entity426;

import fr.spacefox.perftests.quarkus.core.port.data.Entity426DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service426.model.Model426;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity426Repository implements Entity426DatasourcePort, PanacheRepository<Entity426> {
    @Override
    public Optional<Model426> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
