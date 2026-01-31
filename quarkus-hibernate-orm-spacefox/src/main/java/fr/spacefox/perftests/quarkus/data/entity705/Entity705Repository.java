package fr.spacefox.perftests.quarkus.data.entity705;

import fr.spacefox.perftests.quarkus.core.port.data.Entity705DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service705.model.Model705;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity705Repository implements Entity705DatasourcePort, PanacheRepository<Entity705> {
    @Override
    public Optional<Model705> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
