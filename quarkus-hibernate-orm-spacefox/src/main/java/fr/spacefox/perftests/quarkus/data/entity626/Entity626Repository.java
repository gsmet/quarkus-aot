package fr.spacefox.perftests.quarkus.data.entity626;

import fr.spacefox.perftests.quarkus.core.port.data.Entity626DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service626.model.Model626;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity626Repository implements Entity626DatasourcePort, PanacheRepository<Entity626> {
    @Override
    public Optional<Model626> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
