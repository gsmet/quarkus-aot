package fr.spacefox.perftests.quarkus.data.entity407;

import fr.spacefox.perftests.quarkus.core.port.data.Entity407DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service407.model.Model407;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity407Repository implements Entity407DatasourcePort, PanacheRepository<Entity407> {
    @Override
    public Optional<Model407> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
