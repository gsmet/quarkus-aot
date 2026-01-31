package fr.spacefox.perftests.quarkus.data.entity487;

import fr.spacefox.perftests.quarkus.core.port.data.Entity487DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service487.model.Model487;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity487Repository implements Entity487DatasourcePort, PanacheRepository<Entity487> {
    @Override
    public Optional<Model487> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
