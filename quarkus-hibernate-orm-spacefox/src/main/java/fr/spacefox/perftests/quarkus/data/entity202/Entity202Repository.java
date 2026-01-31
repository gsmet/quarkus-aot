package fr.spacefox.perftests.quarkus.data.entity202;

import fr.spacefox.perftests.quarkus.core.port.data.Entity202DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service202.model.Model202;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity202Repository implements Entity202DatasourcePort, PanacheRepository<Entity202> {
    @Override
    public Optional<Model202> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
