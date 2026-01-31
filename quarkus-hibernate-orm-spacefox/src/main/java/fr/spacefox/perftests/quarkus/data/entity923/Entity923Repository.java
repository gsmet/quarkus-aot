package fr.spacefox.perftests.quarkus.data.entity923;

import fr.spacefox.perftests.quarkus.core.port.data.Entity923DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service923.model.Model923;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity923Repository implements Entity923DatasourcePort, PanacheRepository<Entity923> {
    @Override
    public Optional<Model923> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
