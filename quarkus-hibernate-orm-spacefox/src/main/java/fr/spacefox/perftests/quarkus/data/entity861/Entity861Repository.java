package fr.spacefox.perftests.quarkus.data.entity861;

import fr.spacefox.perftests.quarkus.core.port.data.Entity861DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service861.model.Model861;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity861Repository implements Entity861DatasourcePort, PanacheRepository<Entity861> {
    @Override
    public Optional<Model861> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
