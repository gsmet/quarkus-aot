package fr.spacefox.perftests.quarkus.data.entity441;

import fr.spacefox.perftests.quarkus.core.port.data.Entity441DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service441.model.Model441;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity441Repository implements Entity441DatasourcePort, PanacheRepository<Entity441> {
    @Override
    public Optional<Model441> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
