package fr.spacefox.perftests.quarkus.data.entity269;

import fr.spacefox.perftests.quarkus.core.port.data.Entity269DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service269.model.Model269;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity269Repository implements Entity269DatasourcePort, PanacheRepository<Entity269> {
    @Override
    public Optional<Model269> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
