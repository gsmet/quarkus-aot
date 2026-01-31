package fr.spacefox.perftests.quarkus.data.entity353;

import fr.spacefox.perftests.quarkus.core.port.data.Entity353DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service353.model.Model353;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity353Repository implements Entity353DatasourcePort, PanacheRepository<Entity353> {
    @Override
    public Optional<Model353> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
