package fr.spacefox.perftests.quarkus.data.entity768;

import fr.spacefox.perftests.quarkus.core.port.data.Entity768DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service768.model.Model768;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity768Repository implements Entity768DatasourcePort, PanacheRepository<Entity768> {
    @Override
    public Optional<Model768> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
