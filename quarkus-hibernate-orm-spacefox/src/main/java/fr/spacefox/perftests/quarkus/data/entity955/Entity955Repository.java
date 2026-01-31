package fr.spacefox.perftests.quarkus.data.entity955;

import fr.spacefox.perftests.quarkus.core.port.data.Entity955DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service955.model.Model955;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity955Repository implements Entity955DatasourcePort, PanacheRepository<Entity955> {
    @Override
    public Optional<Model955> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
