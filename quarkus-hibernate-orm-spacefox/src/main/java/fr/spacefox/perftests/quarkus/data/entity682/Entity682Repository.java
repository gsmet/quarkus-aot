package fr.spacefox.perftests.quarkus.data.entity682;

import fr.spacefox.perftests.quarkus.core.port.data.Entity682DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service682.model.Model682;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity682Repository implements Entity682DatasourcePort, PanacheRepository<Entity682> {
    @Override
    public Optional<Model682> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
