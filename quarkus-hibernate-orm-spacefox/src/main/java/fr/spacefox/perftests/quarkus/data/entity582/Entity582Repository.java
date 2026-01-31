package fr.spacefox.perftests.quarkus.data.entity582;

import fr.spacefox.perftests.quarkus.core.port.data.Entity582DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service582.model.Model582;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity582Repository implements Entity582DatasourcePort, PanacheRepository<Entity582> {
    @Override
    public Optional<Model582> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
