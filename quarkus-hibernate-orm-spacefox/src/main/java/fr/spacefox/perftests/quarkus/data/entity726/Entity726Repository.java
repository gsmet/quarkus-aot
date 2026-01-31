package fr.spacefox.perftests.quarkus.data.entity726;

import fr.spacefox.perftests.quarkus.core.port.data.Entity726DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service726.model.Model726;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity726Repository implements Entity726DatasourcePort, PanacheRepository<Entity726> {
    @Override
    public Optional<Model726> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
