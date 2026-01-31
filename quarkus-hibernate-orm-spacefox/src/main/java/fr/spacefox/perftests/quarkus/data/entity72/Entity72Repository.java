package fr.spacefox.perftests.quarkus.data.entity72;

import fr.spacefox.perftests.quarkus.core.port.data.Entity72DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service72.model.Model72;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity72Repository implements Entity72DatasourcePort, PanacheRepository<Entity72> {
    @Override
    public Optional<Model72> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
