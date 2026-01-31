package fr.spacefox.perftests.quarkus.data.entity921;

import fr.spacefox.perftests.quarkus.core.port.data.Entity921DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service921.model.Model921;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity921Repository implements Entity921DatasourcePort, PanacheRepository<Entity921> {
    @Override
    public Optional<Model921> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
