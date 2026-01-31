package fr.spacefox.perftests.quarkus.data.entity13;

import fr.spacefox.perftests.quarkus.core.port.data.Entity13DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service13.model.Model13;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity13Repository implements Entity13DatasourcePort, PanacheRepository<Entity13> {
    @Override
    public Optional<Model13> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
