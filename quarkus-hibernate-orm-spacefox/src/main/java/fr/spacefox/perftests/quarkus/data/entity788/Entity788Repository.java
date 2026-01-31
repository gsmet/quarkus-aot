package fr.spacefox.perftests.quarkus.data.entity788;

import fr.spacefox.perftests.quarkus.core.port.data.Entity788DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service788.model.Model788;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity788Repository implements Entity788DatasourcePort, PanacheRepository<Entity788> {
    @Override
    public Optional<Model788> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
