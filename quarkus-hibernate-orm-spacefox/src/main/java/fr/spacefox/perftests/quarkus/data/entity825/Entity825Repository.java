package fr.spacefox.perftests.quarkus.data.entity825;

import fr.spacefox.perftests.quarkus.core.port.data.Entity825DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service825.model.Model825;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity825Repository implements Entity825DatasourcePort, PanacheRepository<Entity825> {
    @Override
    public Optional<Model825> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
