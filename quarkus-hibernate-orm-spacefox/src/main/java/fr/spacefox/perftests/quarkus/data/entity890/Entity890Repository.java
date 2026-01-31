package fr.spacefox.perftests.quarkus.data.entity890;

import fr.spacefox.perftests.quarkus.core.port.data.Entity890DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service890.model.Model890;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity890Repository implements Entity890DatasourcePort, PanacheRepository<Entity890> {
    @Override
    public Optional<Model890> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
