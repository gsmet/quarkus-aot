package fr.spacefox.perftests.quarkus.data.entity477;

import fr.spacefox.perftests.quarkus.core.port.data.Entity477DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service477.model.Model477;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity477Repository implements Entity477DatasourcePort, PanacheRepository<Entity477> {
    @Override
    public Optional<Model477> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
