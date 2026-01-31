package fr.spacefox.perftests.quarkus.data.entity86;

import fr.spacefox.perftests.quarkus.core.port.data.Entity86DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service86.model.Model86;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity86Repository implements Entity86DatasourcePort, PanacheRepository<Entity86> {
    @Override
    public Optional<Model86> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
