package fr.spacefox.perftests.quarkus.data.entity304;

import fr.spacefox.perftests.quarkus.core.port.data.Entity304DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service304.model.Model304;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity304Repository implements Entity304DatasourcePort, PanacheRepository<Entity304> {
    @Override
    public Optional<Model304> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
