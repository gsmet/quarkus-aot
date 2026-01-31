package fr.spacefox.perftests.quarkus.data.entity54;

import fr.spacefox.perftests.quarkus.core.port.data.Entity54DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service54.model.Model54;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity54Repository implements Entity54DatasourcePort, PanacheRepository<Entity54> {
    @Override
    public Optional<Model54> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
