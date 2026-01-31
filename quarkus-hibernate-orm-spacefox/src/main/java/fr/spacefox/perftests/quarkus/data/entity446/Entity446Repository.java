package fr.spacefox.perftests.quarkus.data.entity446;

import fr.spacefox.perftests.quarkus.core.port.data.Entity446DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service446.model.Model446;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity446Repository implements Entity446DatasourcePort, PanacheRepository<Entity446> {
    @Override
    public Optional<Model446> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
