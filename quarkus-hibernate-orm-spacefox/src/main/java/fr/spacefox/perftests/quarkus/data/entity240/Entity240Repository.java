package fr.spacefox.perftests.quarkus.data.entity240;

import fr.spacefox.perftests.quarkus.core.port.data.Entity240DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service240.model.Model240;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity240Repository implements Entity240DatasourcePort, PanacheRepository<Entity240> {
    @Override
    public Optional<Model240> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
