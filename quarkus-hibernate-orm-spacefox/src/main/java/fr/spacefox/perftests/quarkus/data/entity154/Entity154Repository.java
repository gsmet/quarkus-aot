package fr.spacefox.perftests.quarkus.data.entity154;

import fr.spacefox.perftests.quarkus.core.port.data.Entity154DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service154.model.Model154;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity154Repository implements Entity154DatasourcePort, PanacheRepository<Entity154> {
    @Override
    public Optional<Model154> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
