package fr.spacefox.perftests.quarkus.data.entity212;

import fr.spacefox.perftests.quarkus.core.port.data.Entity212DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service212.model.Model212;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity212Repository implements Entity212DatasourcePort, PanacheRepository<Entity212> {
    @Override
    public Optional<Model212> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
