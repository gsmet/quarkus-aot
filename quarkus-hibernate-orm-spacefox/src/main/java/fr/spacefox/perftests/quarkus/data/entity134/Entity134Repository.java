package fr.spacefox.perftests.quarkus.data.entity134;

import fr.spacefox.perftests.quarkus.core.port.data.Entity134DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service134.model.Model134;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity134Repository implements Entity134DatasourcePort, PanacheRepository<Entity134> {
    @Override
    public Optional<Model134> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
