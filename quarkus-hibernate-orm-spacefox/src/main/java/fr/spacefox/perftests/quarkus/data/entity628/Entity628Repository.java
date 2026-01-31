package fr.spacefox.perftests.quarkus.data.entity628;

import fr.spacefox.perftests.quarkus.core.port.data.Entity628DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service628.model.Model628;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity628Repository implements Entity628DatasourcePort, PanacheRepository<Entity628> {
    @Override
    public Optional<Model628> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
