package fr.spacefox.perftests.quarkus.data.entity854;

import fr.spacefox.perftests.quarkus.core.port.data.Entity854DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service854.model.Model854;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity854Repository implements Entity854DatasourcePort, PanacheRepository<Entity854> {
    @Override
    public Optional<Model854> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
