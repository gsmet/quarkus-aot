package fr.spacefox.perftests.quarkus.data.entity43;

import fr.spacefox.perftests.quarkus.core.port.data.Entity43DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service43.model.Model43;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity43Repository implements Entity43DatasourcePort, PanacheRepository<Entity43> {
    @Override
    public Optional<Model43> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
