package fr.spacefox.perftests.quarkus.data.entity706;

import fr.spacefox.perftests.quarkus.core.port.data.Entity706DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service706.model.Model706;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity706Repository implements Entity706DatasourcePort, PanacheRepository<Entity706> {
    @Override
    public Optional<Model706> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
