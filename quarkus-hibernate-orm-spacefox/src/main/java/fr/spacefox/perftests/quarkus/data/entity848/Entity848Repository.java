package fr.spacefox.perftests.quarkus.data.entity848;

import fr.spacefox.perftests.quarkus.core.port.data.Entity848DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service848.model.Model848;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity848Repository implements Entity848DatasourcePort, PanacheRepository<Entity848> {
    @Override
    public Optional<Model848> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
