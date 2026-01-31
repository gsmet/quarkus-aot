package fr.spacefox.perftests.quarkus.data.entity297;

import fr.spacefox.perftests.quarkus.core.port.data.Entity297DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service297.model.Model297;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity297Repository implements Entity297DatasourcePort, PanacheRepository<Entity297> {
    @Override
    public Optional<Model297> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
