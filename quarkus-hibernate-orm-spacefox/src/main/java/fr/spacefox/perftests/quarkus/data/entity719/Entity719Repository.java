package fr.spacefox.perftests.quarkus.data.entity719;

import fr.spacefox.perftests.quarkus.core.port.data.Entity719DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service719.model.Model719;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity719Repository implements Entity719DatasourcePort, PanacheRepository<Entity719> {
    @Override
    public Optional<Model719> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
