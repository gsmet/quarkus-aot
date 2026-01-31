package fr.spacefox.perftests.quarkus.data.entity635;

import fr.spacefox.perftests.quarkus.core.port.data.Entity635DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service635.model.Model635;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity635Repository implements Entity635DatasourcePort, PanacheRepository<Entity635> {
    @Override
    public Optional<Model635> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
