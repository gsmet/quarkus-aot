package fr.spacefox.perftests.quarkus.data.entity631;

import fr.spacefox.perftests.quarkus.core.port.data.Entity631DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service631.model.Model631;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity631Repository implements Entity631DatasourcePort, PanacheRepository<Entity631> {
    @Override
    public Optional<Model631> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
